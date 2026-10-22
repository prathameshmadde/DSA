package Day2;

public class Pb21 {
public static void main(String[] args) {
	   char[] ch = {'A', 'B', 'C', 'D', 'E', 'F'};
       printMiddle(ch);
}
public static void printMiddle(char [] c)
{
if (c.length % 2 ==0) {
	int mid = c.length / 2;
	System.out.println(c[mid - 1]);
    System.out.println(c[mid]);
}
else {
	System.out.println("the array is not even");
	}
}
}
