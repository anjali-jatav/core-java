package controlflow;

public class StarPattern {
	public static void printTriangle() {
		int rc = 5;
		int sc = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < sc; j++) {
				System.out.print("*");

			}
			System.out.println();
			sc++;
		}
	}

	public static void printReverseTriangle() {
		int rc = 5;
		int sc = 1;
		int bsc = 4;
		for (int i = 0; i < rc; i++) {
			for (int j = 0; j < bsc; j++) {
             System.out.print(" ");
			}
			for(int k=0;k<sc;k++) {
				System.out.print("*");
			}
			System.out.println();
		    sc++;
		    bsc--;
		}
	}

	public static void main(String[] args) {
//		printTriangle();
		printReverseTriangle();
	}

}
