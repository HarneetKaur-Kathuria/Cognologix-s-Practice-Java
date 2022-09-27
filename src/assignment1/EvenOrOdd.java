package assignment1;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String ans = num %2==1 ? "Odd" : "Even";
        System.out.println("Number is "+ ans);
    }
}
