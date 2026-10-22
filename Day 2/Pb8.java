package Day2;

public class Pb8 {
public static void main(String[] args) {
	char a[]= {'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7'};
		rev(a);
	}
	public static void rev(char []a) {
		for (int i = a.length-1; i >= 0; i--) {
			System.out.println(a[i]);
		}
	}
}
