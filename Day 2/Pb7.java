package Day2;

public class Pb7 {
public static void main(String[] args) {
	char[] ch = {'A', '7', '@', 'b', '#', '9', '$', '3', 'M'};
	print(ch);
	}
	public static void print(char [] c) {
		for (int i = 0; i < c.length; i++) {
			if(c[i]>= '1' && c[i]<='9') {
				System.out.println(c[i]);
			}
		}
	}
}
