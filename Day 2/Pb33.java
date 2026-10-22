package Day2;

public class Pb33 {

	public static void main(String[] args) {
		char[] ch = {'A', '7', '$', 'm', '#'};
		special(ch);
	}
	public static void special(char [] c) {
		for (int i = 0; i < c.length; i++) {
			if(!(c[i]>='A'&&c[i]<='Z'||c[i]>='a'&&c[i]<='z'||c[i]>='0' && c[i]<='9')) {
				System.out.println(c[i]);
			}
		}
	}
}
