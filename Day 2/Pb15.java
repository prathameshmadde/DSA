package Day2;

public class Pb15 {
public static void main(String[] args) {
	char[] ch = {'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7'};
	print(ch);
	}
public static void print(char[] c) {
	for (int i = 0; i < c.length; i++) {
		if (c[i]>='A'&&c[i]<='Z')
			System.out.println(i);
	}
}
}
