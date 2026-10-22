package Day2;

public class Pb41 {
	    public static void main(String[] args) {
	        int[] a = {12, 8, 15, 7, 20, 9, 11};

	        divisible(a);
	    }

	    public static void divisible(int[] num) {
	        for (int i = 0; i < num.length; i++) {
	            if (num[i] % 3 == 0 || num[i] % 4 == 0) {
	                System.out.println(num[i]);
	            }
	        }
	    }
	}

