package assignment1;

import java.util.Scanner;

public class NumberPositiveOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(positiveOrNot(num));
    }
    public static boolean positiveOrNot(int n){
        if(n<0){
            return false;
        }else{
            return true;
        }
    }
}
