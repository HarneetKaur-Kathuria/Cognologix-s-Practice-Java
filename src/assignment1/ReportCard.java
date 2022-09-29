package assignment1;
import java.util.Scanner;

public class ReportCard {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter Student Name");
        String name = sc.nextLine();
        System.out.print("Enter the Number of Subjects");
        int noOfSub = sc.nextInt();

        // create a integer array to store the marks
        int marks[] = new int [noOfSub];

        marksEntry(marks);
        printReportCard(name , marks, noOfSub);

    }
    /* --- method definition to record marks----*/
    static void marksEntry (int [] subMarks){
           for(int i=0; i< subMarks.length; i++) {
               System.out.print("Marks for subject" + (i + 1) + " : ");
               subMarks [i] = sc.nextInt();
           }
    }

    /*---method definition to generate report card---*/
    static void printReportCard(String student , int [] marksObt , int totalSub){
        System.out.println("------------------------------------------");
        System.out.println("REPORT CARD");
        System.out.println("Name : "+ student);
        System.out.println("------------------------------------------");
        System.out.println(" SUBJECT \t \t MARKS");

        int totalMarks = 0;
        for(int i=0; i<totalSub; i++){
            System.out.println("Subject -" +(i+1)+ "\t  \t  " +marksObt[i]);
            totalMarks += marksObt[i];
        }
        System.out.println("------------------------------------------");
        float avg = ((float)totalMarks)/ totalSub;
        System.out.printf("TOTAL : %d \t AVERAGE : %.2f \n", totalMarks, avg);
        System.out.println("------------------------------------------");

    }
}
