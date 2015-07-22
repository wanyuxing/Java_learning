

public class P6_12 {

	public static void main(String[] args) {
		// generate 20 random dies
		int[] ranDie = new int[20];
		for (int i = 0; i < 20; i++) {ranDie[i] = (int) (Math.random() * 6);}
		
		boolean inRun = false;
		for (int j = 0; j < 19; j++) {
			if (inRun) {
				if (ranDie[j] != ranDie[j - 1]) {
					System.out.print(")");
					inRun = false;}
				}
			else {
				if (ranDie[j] == ranDie[j + 1]) {
					System.out.print("(");
					inRun = true;
				}
			}
			System.out.print(ranDie[j]);
		}
		if (inRun) {System.out.print(")");}
	} 
}
