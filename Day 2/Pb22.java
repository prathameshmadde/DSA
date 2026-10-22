package Day2;

public class Pb22 {
public static void main(String[] args) {
	char[] ch = {'J', 'a', 'v', 'a'};
sumchar(ch);
}
public static void sumchar(char[] d) {
	int sum = 0;
	for (int i = 0; i < d.length; i++) {
		sum = sum + d[i];
	}
	System.out.println(sum);
}
}
