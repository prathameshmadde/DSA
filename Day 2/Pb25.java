package Day2;

public class Pb25 {
public static void main(String[] args) {
	char[] ch = {'M', 'N', 'O'};
	avg(ch);
}
public static void avg(char [] c) {
	double sum = 0;
	for (int i = 0; i < c.length; i++) {
		sum += c[i];
	}
	double avg = sum/c.length;
	System.out.println("avg "+avg);
}
}
