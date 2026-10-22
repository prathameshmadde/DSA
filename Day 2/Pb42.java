package Day2;

public class Pb42 {

	    public static void main(String[] args) {
	        int[] a = {12, 8, 15, 24, 7, 36, 20};
	        divisible(a);
	    }

	    public static void divisible(int[] num) {
	        for (int i = 0; i < num.length; i++) {
	            if (num[i] % 3 == 0 && num[i] % 4 == 0) {
	                System.out.println(num[i]);
	            }
	        }
	    }
	}

