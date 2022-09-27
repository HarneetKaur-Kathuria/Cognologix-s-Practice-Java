package assignment1;

import java.util.Scanner;

public class NumberIsPositiveZeroNegative
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(positiveZeroNegative(num));
    }
    public static String positiveZeroNegative(int n){

        if(n<0){
            return "Number is Negative";
        }
        else if  (n>0) {
            return "Number is Positive";
        }else{
            return "Number is Zero";
        }

    }
}
