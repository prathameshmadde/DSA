package Day2;

public class Pb28 {
	public static void main(String[] args) {
		char[] ch = {'A', 'C', 'E'};
		prod(ch);
	}
	public static void prod(char [] c) {
		int prod = 1;
		for (int i = 0; i < c.length; i++) {
			if(c[i] % 2 != 0)
				prod *= c[i];
		}
		System.out.println("product "+prod);
	}
}
