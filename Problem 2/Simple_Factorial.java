// Brute force approach

import java.util.*;

public class Test{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int a = 0, b = 1;
        for(int i = 0; i <= n; i++){
            System.out.println(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
