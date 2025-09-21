public class Test {
    public static void main(String[] args) {
        int limit = 4_000_000;
        int a = 0, b = 1;
        int sum = 0;

        while(b <= limit){
            if(b % 2 != 0){
                sum += b;
            }
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println(sum);
    }
}

/*
note that this gives out the same output as the even version (original) 
*/
