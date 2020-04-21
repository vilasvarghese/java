package java5;

public class VarArgsImpl {
	
	public static void main(String[] args) {
		VarArgsImpl vi = new VarArgsImpl();
		System.out.println(vi.add(1,2,3,4));
		System.out.println(vi.add(9,3,4,2,3,3,4,5));
	}

	public int add(int ... is ) {//will reach here like an array
		int sum = 0;
		System.out.println(is.length);
		for (int i : is) {
			sum += i;
		}
		return sum;
	}
}