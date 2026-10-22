package Day2;
import java.util.Scanner;
public class UserChar {
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter the size : ");
	 int size = scn.nextInt();
	 char ch[] = new char[size];
	 for (int i = 0; i < ch.length; i++) {
		System.out.println("enter character :");
		ch[i] = scn.next().charAt(0); 
	}
	 printch(ch);
	}
	public static void printch(char print[]) {
		for (int i = 0; i < print.length; i++) {
			System.out.println(print[i]);
		}
	}
}
