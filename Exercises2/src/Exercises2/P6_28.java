package Exercises2;

import java.util.ArrayList;

public class P6_28 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1); a.add(4); a.add(9); a.add(16); a.add(17); a.add(100);
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(4); b.add(7); b.add(9); b.add(9); b.add(11); b.add(18); b.add(1000); b.add(10000);
		ArrayList<Integer> c = mergeSorted(a, b);
		for (int k = 0; k < c.size(); k++) {System.out.print(c.get(k)); System.out.print(" ");}
	}
	private static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b) {
		ArrayList<Integer> c = new ArrayList<Integer>();
		int i = 0;
		int j = 0;
		for (int k = 0; k < a.size() + b.size(); k++) {
			if (a.get(i) <= b.get(j)) {
				c.add(a.get(i)); 
				if (i < a.size() - 1){i += 1;}
				else {a.set(i, Integer.MAX_VALUE);}
			}
			else {
				c.add(b.get(j)); 
				if (j < b.size() - 1) {j += 1;}
				else {b.set(j, Integer.MAX_VALUE);}
			}
		}
		return c;
	}
}
