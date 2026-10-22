package Day2;

public class Pb6 {
public static void main(String[] args) {
	char[] ch = {'A', 'b', 'e', '#', 'I', '@', 'm', 'o', 'P', '$', 'u', '7'};
	special(ch);
	}
	public static void special(char [] ch) {
		for (int i = 0; i < ch.length; i++) {
			if (!(ch[i] >= 'A' && ch[i] <= 'Z') &&
	                !(ch[i] >= 'a' && ch[i] <= 'z') &&
	                !(ch[i] >= '0' && ch[i] <= '9')) {
				System.out.println(ch[i]);
		}
			
		}
	}
}
