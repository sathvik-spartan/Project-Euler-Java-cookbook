public class Solution1 {
    public static void main(String[] args) {
        int limit = 1000; // Since we need sum of multiples of 3 and 5.
        int sum = 0;
        for(int i = 1; i < limit; i++){
            if(i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

/*
Time complexity is O(n), where n is the limit.
*/
