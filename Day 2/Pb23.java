package Day2;

public class Pb23 {
public static void main(String[] args) {
	char[] ch = {'B', 'c', 'D', 'e'};
	print(ch);
}
public static void print(char [] ch) {
	int sum = 0;
	for (int i = 0; i < ch.length; i++) {
		if(ch[i] % 2 == 0)
			sum = sum + ch[i];
	}
	System.out.println(sum);
}

}
