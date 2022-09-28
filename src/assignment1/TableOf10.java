package assignment1;

import java.util.Scanner;

public class TableOf10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1; i<=10;i++){
            int product =  num*i;
            System.out.println(num+" x "+i+" = "+product);
        }
    }
}
