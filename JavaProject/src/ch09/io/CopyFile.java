package ch09.io;

import java.io.*;

public class CopyFile {


	   public static void main(String args[]) throws IOException {
	      FileReader in = null;
	      FileWriter out = null;

	      try {
	         in = new FileReader("D:\\code\\JavaProject\\src\\io\\input.txt");
	         out = new FileWriter("D:\\code\\JavaProject\\src\\io\\output.txt");
	         
	         int c;
	         while ((c = in.read()) != -1) {
	            out.write(c);
	         }
	      }finally {
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
	      }
	   }
}