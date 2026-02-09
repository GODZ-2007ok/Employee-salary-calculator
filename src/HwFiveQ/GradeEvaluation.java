package HwFiveQ;
import java.util.Scanner;
public class GradeEvaluation {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        displayGrades(marks);
    }

    public static char assignGrade(int marks) {
        if (marks >= 90)
            return 'A';
        else if (marks >= 80)
            return 'B';
        else if (marks >= 70)
            return 'C';
        else
            return 'F';
    }

        public static void displayGrades(int[] marks) {
        int sum = 0;

        System.out.println("\n--- Student Grades ---");
        for (int i = 0; i < marks.length; i++) {
            char grade = assignGrade(marks[i]);
            System.out.println("Student " + (i + 1) + ": Marks = " + marks[i] + " | Grade = " + grade);
            sum += marks[i];
        }

        double avg = (double) sum / marks.length;
        System.out.println("\nClass Average = " + avg);
        System.out.println("Overall Grade = " + assignGrade((int) avg));
    }


	}
	


