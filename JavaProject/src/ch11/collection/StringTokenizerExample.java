package ch11.collection;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String args[]) {
		StringTokenizer st = new StringTokenizer("my name is Vilas", " ");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
