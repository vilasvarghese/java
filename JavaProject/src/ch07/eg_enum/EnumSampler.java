package ch07.eg_enum;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EnumSampler {

	public static void main(String[] args) {
		TeaShop teaShop = new TeaShop();
		teaShop.type = TeaShop.TeaType.MEDIUM;
		TeaShop.TeaFlavour tf = TeaShop.TeaFlavour.MASALA_TEA;
		TeaShop ts = null;
		//TeaShop.t
		LinkedList<Integer> list = new LinkedList();
		LinkedHashSet<Integer> list1 = new LinkedHashSet();
	}
}

class TeaShop{
	enum TeaType{ LIGHT, MEDIUM, STRONG};
	TeaType type;
	public TeaShop ts;
	
	enum TeaFlavour {MASALA_TEA, LEMON_TEA, BLACK_TEA};
}