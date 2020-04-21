package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.Future;

public class StudentCallable implements Callable {

    Student student = null;
    int index = 0;
    Lock writeLock = null;
    Lock readLock =  null;
    ReadWriteLock lock = new ReentrantReadWriteLock();

    StudentCallable(Student student, int index, Lock readLock, Lock writeLock){
        this.student = student;
        this.index = index;
        this.readLock = readLock;
        this.writeLock = writeLock;
    }

    @Override
    public Object call() throws Exception {
        if(index % 5 == 0 ){
            try {
                writeLock.lock();
                System.out.println("Updating the student ");
                student.setStudentID(student.getStudentID() + index);
                student.setStudentName(student.getStudentName() + ":" + index);
                System.out.println("Update done");
            }catch(Exception e){
                e.printStackTrace();
                return false;
            }finally{
                writeLock.unlock();
            }
        }else{
            try {
                readLock.lock();
                System.out.println(" Reading the student details");
                System.out.println(" ID:"+  student.getStudentID());
                System.out.println(" Name:"+  student.getStudentName());
                System.out.println(" student details read");
            }catch(Exception e){
                return false;
            }finally{
                readLock.unlock();
            }
        }
        return true;
    }

    public static void main(String args[]){
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Student student = new Student();
        student.setStudentID(1000);
        student.setStudentName("Chris");

        ReadWriteLock lock = new ReentrantReadWriteLock();
        Lock wLock = lock.writeLock();
        Lock rLock = lock.readLock();

        for(int counter = 1; counter <= 20; counter++){
            Future future = executorService.submit(new StudentCallable(student,counter,rLock,wLock));
        }
        executorService.shutdown();
    }
}
