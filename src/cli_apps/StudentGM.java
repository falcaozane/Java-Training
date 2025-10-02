package cli_apps;

/*

Project: Student Grade Manager (CLI)
🎯 What It Does:

Takes student name and marks as input
Calculates total and average
Determines grade using if-else
Uses switch to give feedback
Uses loops to handle multiple students


 */

import java.util.Scanner;

public class StudentGM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello World!");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many Students: ");
		int count = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= count; i++) {
			System.out.println("\nStudent id: "+i+":-");
			
			System.out.print("Enter Name: ");
			String name = sc.nextLine();
			
			System.out.println("\nEntering marks for Student Name: "+name);

			System.out.print("Enter marks in Math: ");
            int math = sc.nextInt();

            System.out.print("Enter marks in Science: ");
            int science = sc.nextInt();

            System.out.print("Enter marks in English: ");
            int english = sc.nextInt();
            sc.nextLine(); // consume newline
            
            // edge cases
            
            if (math < 0 || science < 0 || english < 0) {
                System.out.println("Marks cannot be negative. Skipping student.");
                continue;
            }
            
            if (math > 100 || science > 100 || english > 100) {
                System.out.println("Marks cannot exceed 100. Skipping student.");
                continue;
            }


             
            int total = math+english+science;
            double avg = total/3.0;
            

            System.out.println("Total Marks: " + total);
            System.out.println("Average: " + avg);
            
            // grade using if-else
            
            char grade;
            if(avg>=90) {
            	grade = 'A';
            }
            else if (avg>=75) {
            	grade = 'B';
            }
            else if (avg>=60) {
            	grade = 'C';
            }
            else if(avg>=40) {
            	grade = 'D';
            }
            else {
            	grade = 'F';
            }
            
            System.out.println("Grade:"+grade);
            

         // Feedback using switch
             switch (grade) {
                    case 'A': System.out.println("Excellent!"); break;
                    case 'B': System.out.println("Good job!"); break;
                    case 'C': System.out.println("Fair effort."); break;
                    case 'D': System.out.println("Needs improvement."); break;
                    case 'F': System.out.println("Failed. Try harder."); break;
                    default: System.out.println("Invalid grade.");
                 }
        }

                 sc.close();
	}

}
