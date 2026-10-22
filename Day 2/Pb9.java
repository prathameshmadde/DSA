package Day2;

public class Pb9 {
	public static void main(String[] args) {
		char[] ch = {'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7'};
		eveIndex(ch);
	}
	public static void eveIndex(char [] c) {
		for (int i = 0; i < c.length; i++) {
			if(i % 2 == 0)
			{
				System.out.println(c[i]);
			}
		}
	}
}
