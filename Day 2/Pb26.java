package Day2;

public class Pb26 {
	public static void main(String[] args) {
		char[] ch = {'A', 'B', 'C'};
		prod(ch);
	}
	public static void prod(char [] c) {
		int prod = 1;
		for (int i = 0; i < c.length; i++) {
			prod *= c[i];
		}
		System.out.println("product "+prod);
	}

}
