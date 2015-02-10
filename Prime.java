public class Prime {
		public static int Fibonacci(int termNumber) {
			if (termNumber == 1) {
				return 1;
			}
			if (termNumber == 2) {
				return 2;
			}
			return Fibonacci (termNumber - 1) + Fibonacci (termNumber - 2);
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
			
			System.out.println("The total number is :" + total);
		}

	}