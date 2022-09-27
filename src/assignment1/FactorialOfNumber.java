package assignment1;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Factorial of Number "+num+ " is "+factorial(num));
    }

    public static int factorial(int n){
        int ans =1;
        for(int i=1; i<=n; i++){
            ans = ans*i;
        }

        return ans;
    }
}
