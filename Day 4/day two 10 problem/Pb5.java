public class Pb5 {
public static void main(String[] args) {
	char[] ch = {'A', 'b', 'e', '#', 'I', 'm', 'o', 'P', 'u', '7'};
	lower(ch);
	}
	public static void lower(char ch []) {
		for (char c : ch) {
			if (c >='a'&& c <='z') {
				System.out.println(c);
			}
		}
	}
}