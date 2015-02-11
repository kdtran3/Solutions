
public class sumEvenFibo {
public static int Fibonacci(int termN) {
		
		if (termN == 1) {
		return 1;
		}
		if (termN == 2) {
		return 2;
		}
		return Fibonacci (termN - 1) + Fibonacci (termN - 2);
		}
		
	public static void main (String[] args) {
		int counter = 1;
		int total = 0;

			while ( Fibonacci(counter) <= 4000000 ) {
				if (Fibonacci(counter) % 2 == 0) {
					total += Fibonacci(counter);
				}
				counter++;
			}	
			System.out.println("The total number is : " + Integer.toString(total));
		}
}
