
public class Factorial {
	//todo: implement a recursive functions which gives you the factorial value of a given number
	
	public static int calcFactorial(int num) {
		if (num < 2) {
			return 1;
		}
		else {
			return calcFactorial (num - 1) * num; 
		}
		 
	}
	
	
	public static void main (String []args) {
		System.out.println(calcFactorial(5));
		System.out.println("Did I commit?");
		
	}
}
