
package assignment1;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(eligibilityOfCandidate(age));
    }
    public static String eligibilityOfCandidate(int age){
        if(age<18){
            return "Not Eligible";
        }else{
            return "Eligible";
        }
    }
}

