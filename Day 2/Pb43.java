package Day2;

public class Pb43 {
	 public static void main(String[] args) {
	        int[] a = {12, 8, 15, 24, 7, 36, 20};
	        int sum = divisible(a);
	        System.out.println("Sum = " + sum);
	    }

	    public static int divisible(int[] num) {
	        int sum = 0;

	        for (int i = 0; i < num.length; i++) {
	            if (num[i] % 3 == 0 || num[i] % 4 == 0) {
	                sum = sum + num[i];
	            }
	        }
	        return sum;
	    }
	}

