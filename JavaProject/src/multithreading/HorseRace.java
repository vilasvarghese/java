package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class HorseRace {

    public static class Participants implements Callable{

        private CountDownLatch startFlag = null;
        private CountDownLatch endFlag = null;

        private int participantID = 0;

        public Participants(CountDownLatch startFlag,
                            CountDownLatch endFlag,
                            int participantID) {
            this.startFlag = startFlag;
            this.endFlag = endFlag;
            this.participantID = participantID;
        }

        @Override
        public String call() throws Exception {

            try {
                startFlag.await();
                Random random = new Random();
                long t1 = System.currentTimeMillis();
                Thread.sleep(random.nextInt(100));
                long t2 = System.currentTimeMillis();

                return "Completed the race by thread " + participantID
                        + "  in : " + (t2 - t1) + " msec.";
            }finally {
                endFlag.countDown();
            }
        }
    }

    public static void main(String args[]) throws ExecutionException, InterruptedException {
        CountDownLatch startFlagLatch = new CountDownLatch(1);
        CountDownLatch endFlagLatch = new CountDownLatch(5);

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        List<Future> resultList = new ArrayList<Future>(5);
        for(int counter = 1; counter <= 5; counter++){
            resultList.add(executorService.submit(
                        new HorseRace.Participants(startFlagLatch, endFlagLatch,counter)));
        }
        System.out.println("Submitted all from main... ");
        startFlagLatch.countDown();
        System.out.println("StartFlag countdown to zero. Now all participants can start race");

        System.out.println("Waiting for end flag countdown to reach zero");
        endFlagLatch.await();
        
        //Doubt : Shouldn't end get called 5 times?

        for(int i = 0; i < resultList.size(); i++){
            Future participantTiming = resultList.get(i);
            System.out.println(""+ participantTiming.get());
        }
        

        executorService.shutdown();
    }
}
