public class Problem_3 {
    public static void main(String[] args) {
        long n = 600851475143L;
        long largestPrime = -1;

        // Divide out all the 2s
        while (n % 2 == 0) {
            largestPrime = 2;
            n /= 2;
        }
        // Now n is odd, so we test only odd numbers
        for (long i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                largestPrime = i;
                n /= i;
            }
        }
        // If n is still > 2, then n itself is a prime number
        if (n > 2) {
            largestPrime = n;
        }
        System.out.println("Largest Prime Factor: " + largestPrime);
    }
}
