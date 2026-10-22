package Day2;

public class Pb37 {
public static void main(String[] args) {
	char[] ch = {'A', '4', '#', '8', 'm', '2'};
	print(ch);
}
public static void print(char [] ch) {
	for (int i = ch.length-1; i >= 0; i--) {
		if (ch[i]>='0'&&ch[i]<='9') {
			System.out.println(ch[i]);
			break;
		}
	}
}
}
