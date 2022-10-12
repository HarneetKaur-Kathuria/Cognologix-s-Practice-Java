package assignment1;
import java.util.Arrays;
import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fib1 =0;
        int fib2 =1, fib=0;
        System.out.print(fib1+" "+ fib2+" ");
        while(fib<=num-2){
            fib = fib1+fib2;
            System.out.print(fib+" ");
            fib1 = fib2;
            fib2 = fib;
        }
    }
}
