
public class Fibonacci {
	//todo: The Fibonacci sequence is a sequence where the current number is the sum of the previous numbers. You can read it up here:
	//https://en.wikipedia.org/wiki/Fibonacci_number
	//Write an iterative method fib which takes an integer as parameter. This integer corresponds to the position in the Fibonacci
    // sequence.
	//fib should return the fibonacci number at this position. For example, fib(4) should return 3.
	//Now, write a second methond fibRek. fibRek does exactly the same like fib, but it works recursive.

    public static int fibRek(int num) {
        if (num == 0) {
            return 0;
        }
        else if (num == 1 || num == 2) {
            return 1;
        }
        else {
            int fit = fibRek(num - 1) + fibRek(num - 2);
            return fit;
        }

    }


    public static void main (String []args) {
        System.out.println(fibRek(4));

    }

}
