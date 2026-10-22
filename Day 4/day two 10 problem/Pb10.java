public class Pb10 {
	public static void main(String [] args) {
	char[] ch = {'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7'};
	oddIndex(ch);
	}
	public static void oddIndex(char [] ch) {
		for (char c : ch ) {
			if(c % 2 != 0) {
				System.out.println(c);
			}
		}
	}
}