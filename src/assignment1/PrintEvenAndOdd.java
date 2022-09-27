package assignment1;

import java.util.Scanner;

public class PrintEvenAndOdd {
    public static void main(String[] args) {
        printTenEvenNumbers();
        printtenOddNumbers();
    }

    public static void printTenEvenNumbers(){
        int num =0;
        for(int limit=0; limit<10; num++){
            if(num%2==0){
                System.out.println(num+" ");
                limit++;
            }
        }
    }

    public static void printtenOddNumbers(){
        int num =1;
        for(int limit=0; limit<10; num++){
            if(num%2==1){
                System.out.println(num+" ");
                limit++;
            }
        }
    }
}
