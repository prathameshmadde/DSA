package Day2;

public class Pb44 {
	    public static void main(String[] args) {
	        int[] a = {12, 8, 15, 24, 7, 36, 20};
	        int prod = divisible(a);
	        System.out.println("Product = " + prod);
	    }

	    public static int divisible(int[] num) {
	        int prod = 1;

	        for (int i = 0; i < num.length; i++) {
	            if (num[i] % 3 == 0 && num[i] % 4 == 0) {
	                prod = prod * num[i];
	            }
	        }
	        return prod;
	    }
	}

