package ch11.collection;

import java.util.Comparator;

public class CompareImpl implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1 % 100 > o2 % 100 ? 1 : -1;
	}
}
