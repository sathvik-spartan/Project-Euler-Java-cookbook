import java.util.*;
public class factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        System.out.println("Factors are: " + n );

        for(int i = 1 ; i <= n; i++){
            if(n % i == 0){
                System.out.println(i + " ");
            }
        }
    }
}
