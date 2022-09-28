package assignment1;

import java.util.Scanner;

public class AddDigitOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res=0;
        while(num>0){
            int rem = num%10;
            res +=rem;
            num = num/10;
        }
        System.out.println(res);
    }
}
