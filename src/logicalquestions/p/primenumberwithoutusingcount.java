package logicalquestions.p;

public class primenumberwithoutusingcount {

	public static void main(String[] args) {
		
		int number = 29; // You can change this to any number you want to check
        boolean isPrime = isPrime(number);

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
    public static boolean isPrime(int number) {
        // 1 is not a prime number
        if (number <= 1) {
            return false;
        }
        // Check from 2 to the square root of the number
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                return false; // number is divisible by i, so it's not prime
            }
        }
        return true; 
	}
}
