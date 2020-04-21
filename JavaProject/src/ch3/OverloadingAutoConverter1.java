package ch3;

public class OverloadingAutoConverter1 {

	    public static void go(int x) { 
	        System.out.print("int "); 
	    }  
	    public static void go(long x) { 
	        System.out.print("long "); 
	    }  
	    public static void go(double x) { 
	        System.out.print("double "); 
	    }
	  
	    public static void go(short s) {
	    	System.out.print("short");
	    }
	    public static void main(String [] args) {    
	        byte b = 5;    short s = 5;    long l = 5;    float f = 5.0f;
	        go(b);    go(s);    go(l);    go(f);  
	    } 
	    //byte 
	    //1: is byte present - Yes, call that
	    //2: else if short is there, convert to that and call that method
	    //3: else if int is there, convert to that and call that method
	    //short - similar rules apply
	    
	    
}
