public class Problem2 {
    public static void main(String[] args) {
        int limit = 4_000_000; // Readability
        int a = 1 , b = 2; // First two fibonacci numbers
        int sum = 0;

        while(b <= limit){
            if(b % 2 == 0){
                sum += b;  // add only even terms
            }
            int next = a + b; // Sum starts from here + fibonacci printing sequence
            a = b;
            b = next;
        }
        System.out.print("Sum of even Fibonacci numbers up to " + limit + " = " + sum);
    }
}
