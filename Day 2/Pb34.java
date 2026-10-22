package Day2;

public class Pb34 {
	public static void main(String[] args) {
		char[] ch = {'A', '#', 'm', '5', '9'};
		print(ch);
	}
	public static void print(char[] c) {
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= '0' && c[i] <= '9') {
                System.out.println(c[i]);
                break;
            }
        }
    }
}
