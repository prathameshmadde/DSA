package Day2;

public class Pb11 {
	public static void main(String[] args) {
		char[] ch = {'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7'};
		eIndex(ch);
	}
	public static void eIndex(char [] c) {
		for (int i = 0; i < c.length; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
