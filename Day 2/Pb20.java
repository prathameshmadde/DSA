package Day2;

public class Pb20 {
public static void main(String[] args) {
	char[] ch = {'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7'};
	print(ch);
}
public static void print(char [] c) {
	for (int i =c.length-3; i < c.length; i++){
		System.out.println(c[i]);
	}

}
}
