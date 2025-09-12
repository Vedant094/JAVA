import java.util.Scanner;

class StudentMarksAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        int[][] marks = new int[numberOfStudents][numberOfSubjects];

        // Read marks for each student and subject
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter data for student " + (i + 1) + ":");
            for (int j = 0; j < numberOfSubjects; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                marks[i][j] = scanner.nextInt();
            }
        }

        // Calculate total marks for each student
        int[] totalMarks = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < numberOfSubjects; j++) {
                totalMarks[i] += marks[i][j];
            }
        }

        // Find the highest marks in each subject and the corresponding roll number
        int[] highestMarks = new int[numberOfSubjects];
        int[] rollNumbers = new int[numberOfSubjects];
        for (int j = 0; j < numberOfSubjects; j++) {
            int maxMarks = marks[0][j];
            int maxRollNumber = 1;

            for (int i = 1; i < numberOfStudents; i++) {
                if (marks[i][j] > maxMarks) {
                    maxMarks = marks[i][j];
                    maxRollNumber = i + 1;
                }
            }

            highestMarks[j] = maxMarks;
            rollNumbers[j] = maxRollNumber;
        }

        // Find the student with the highest total marks
        int maxTotalMarks = totalMarks[0];
        int maxTotalMarksRollNumber = 1;
        for (int i = 1; i < numberOfStudents; i++) {
            if (totalMarks[i] > maxTotalMarks) {
                maxTotalMarks = totalMarks[i];
                maxTotalMarksRollNumber = i + 1;
            }
        }

        // Display the results
        System.out.println("\nTotal Marks Obtained by Each Student:");
        System.out.println("-------------------------------------");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ": " + totalMarks[i]);
        }

        System.out.println("\nHighest Marks in Each Subject:");
        System.out.println("------------------------------");
        for (int j = 0; j < numberOfSubjects; j++) {
            System.out.println("Subject " + (j + 1) + ": " + highestMarks[j] + " (Student " + rollNumbers[j] + ")");
        }

        System.out.println("\nStudent with the Highest Total Marks:");
        System.out.println("------------------------------------");
        System.out.println("Student " + maxTotalMarksRollNumber + ": " + maxTotalMarks);
    }
}
