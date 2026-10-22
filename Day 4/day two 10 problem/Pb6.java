public class Pb6 {
public static void main(String[] args) {
	char[] ch = {'A', 'b', 'e', '#', 'I', '@', 'm', 'o', 'P', '$', 'u', '7'};
	special(ch);
	}
	public static void special(char [] ch) {
		for (char c : ch) {
			if (!(c >= 'A' && c <= 'Z') &&
	                !(c >= 'a' && c <= 'z') &&
	                !(c >= '0' && c <= '9')) {
				System.out.println(c);
		}
			
		}
	}
}