package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializer implements Serializable{

	int chair = 0;
	transient int fan = 0;
	int light = 0;
	
	public static void main(String[] args) throws IOException,ClassNotFoundException {
		Serializer s = new Serializer();
		s.chair = 9;
		s.fan = 2;
		s.light = 3;
		writeObject(s);
		readObject();
	}
	
	public static void writeObject (Serializer s) throws IOException{
		FileOutputStream fos = null;
		ObjectOutputStream bos = null;

		try {
			fos = new FileOutputStream("D:\\serializer.txt");
			bos = new ObjectOutputStream(fos);
			bos.writeObject(s);
		}finally{
			bos.close();
			fos.close();
		}
	}
	
	public static void readObject () throws IOException, ClassNotFoundException{
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream("D:\\serializer.txt");
			ois = new ObjectInputStream(fis);
			
			Serializer s1 = (Serializer)ois.readObject();
			System.out.println(s1.chair);
			System.out.println(s1.fan);
			System.out.println(s1.light);
		}finally {
			ois.close();
			fis.close();
		}
	}
}
