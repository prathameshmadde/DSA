public class Pb4 {
	public static void main(String[] args) {
		char[] ch = {'A', 'b', 'e', '#', 'I', 'm', 'o', 'P', 'u', '7'};
		cap(ch);
	}
	public static void cap(char [] ch) {
		for (char c : ch) {
			if (c >='A'&& c <='Z') {
				System.out.println(c);
			}
		}
	}
}