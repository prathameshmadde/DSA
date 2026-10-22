package Day2;

public class Pb31 {
	public static void main(String[] args) {
	char[] ch = {'#', '7', 'm', 'P', 'a'};
	printUpper(ch);
	}
	public static void printUpper(char [] c) {
	for (int i = 0; i < c.length; i++) {
		if (c[i]>='A' && c[i]<='Z')
			System.out.println(c[i]);
	}
	}
}