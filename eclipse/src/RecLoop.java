import java.util.Scanner;

public class RecLoop {

	//todo: Look at the given code and try to understand the methods.
	//The first method euklidRek uses recursion to compute the euclidean algorithm.
	//You can look up the algorithm here: https://en.wikipedia.org/wiki/Euclidean_algorithm
	//Add another method euclidIterative that computes the euclidean algorithm iterative.
	//The second method powIterative computes the the base to the power of n in a iterative way.
	//Add another method powRek which does exactly the same, but by using recursion.

	public static int euclidRec(int a, int b) {
		if (a == b) {
			return a;
		} else if (b > a) {
			int temp = a;
			a = b;
			b = temp;
			return euclidRec(a, b);
		} else {
			return euclidRec(a - b, b);
		}
	}

	public static int euclidIterative(int a, int b) {

		while (true) {
			//run function if true
			if (a > b) {
				a = a - b;
				b = b;
			}
			//Swap if true
			else if (b > a) {
				int temp = a;
				a = b;
				b = temp;
			}
			//return answer
			else {
				return a;
			}
		}
	}

		public static double powIterative ( final double base, final int n){
			if (n < 0) {
				System.out.println("(Our version of) power is undefined for negative numbers.");
				return -1;
			} else {
				double result = 1;

				for (int i = n; i > 0; --i) {
					result = result * base;
				}
				return (int) result;
			}
		}

	public static double powRek ( final double base, final int n){
		if (n <= 0 ) {
			System.out.println("(Our version of) power is undefined for negative numbers.");
			return -1;
		} else if (n == 1) {
			return base;
		}
		else {
				return base * powRek(base,n-1);
		}
	}

		public static void main (String []args) {
		System.out.println(euclidIterative(9,6));
		System.out.println(powRek(5,2));

	}
}


