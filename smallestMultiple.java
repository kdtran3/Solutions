
public class smallestMultiple {
	public static void main(String[] args){
		long sum = 0;
			for (long multiple = 0; multiple <250000000; ++multiple){
				if (multiple % 1 == 0 && multiple % 2 == 0 && multiple % 3 == 0 && multiple % 4 == 0 && multiple % 5 == 0 && multiple % 6 == 0 && multiple % 7 == 0 && multiple % 8 == 0 && multiple % 9 == 0 && multiple % 10 == 0 && multiple % 11 == 0 && multiple % 12 == 0 && multiple % 13 == 0 && multiple % 14 == 0 && multiple % 15 == 0 && multiple % 16 == 0 && multiple % 17 == 0 && multiple % 18 == 0 && multiple % 17 == 0 && multiple % 18 == 0 && multiple % 19 == 0 && multiple % 20 == 0){
				sum = multiple;
				}
				
			}
					System.out.println(sum);
	}
	
}
