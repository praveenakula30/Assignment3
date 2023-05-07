import java.util.Scanner;
public class printPrimes {
	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			String a = s.next();
			String b = s.next();
			for ( int i =0; i <=1; i++) {
				if (isPrime(i)) {
					System.out.print(i + " ");
				}
			}
		}
}