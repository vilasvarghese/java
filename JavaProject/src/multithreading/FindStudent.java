package multithreading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/*
 * There are 5 directories. Write a multi threaded program 
 * which can go through each of the directories and find the 
 * student. The moment the student is found all threads should stop execution
 * 
 */

public class FindStudent implements Runnable{//Rather StudentFinder

	String name;
	String searchKey;
	File file;
	volatile boolean found = false;
	
	public FindStudent(String name, String searchkey, File file) {
		this.name = name;
		this.searchKey = searchkey;
		this.file = file;
	}
	
	public void run() {
		Scanner s = null;
		try {
			s = new Scanner(this.file);
		}catch(FileNotFoundException fe) {
			fe.printStackTrace();
		}
		while (s.hasNextLine()) {
			while (!found) {
				String line = s.nextLine();
				System.out.println(line);
				if (line.indexOf(searchKey) > -1) {
					found = true;
					System.out.println("Found the "+searchKey);
				}
			}
		}
		s.close();
	}
	
	public static void main(String[] args) throws Exception{
		Thread[] tArray = new Thread[5];
		for (int i =0; i < 5; i++) {
			File f = new File("D:\\code\\JavaProject\\src\\multithreading\\student"+i+".txt");
			//System.out.println(new BufferedReader(new FileReader(f)));
			FindStudent fs = new FindStudent("Student"+i, "vilas", f);
			tArray[i] = new Thread(fs);
			tArray[i].start();
		}
	}
}
