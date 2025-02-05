public class StudentRecord {
    public static void main(String[] args) {
        // Variables to hold student information
        String studentName = "Lovenesh";
        int studentID = 12345;
        String courseName = "Computer Science";
        String semester = "Spring 2025";
        String[] subjects = {"Math", "Physics", "Chemistry", "English", "Computer Science"};
        int[] marks = {87, 91, 77, 89, 96};
        char[] grades = {'A', 'A', 'B', 'A', 'A'};

        // Header of the grade sheet
        System.out.println("**************");
        System.out.println("\t\tStudent Grade Sheet");
        System.out.println("**************\n");

        // Student details
        System.out.println("Student Name:\t" + studentName);
        System.out.println("Student ID:\t" + studentID);
        System.out.println("Course:\t\t" + courseName);
        System.out.println("Semester:\t" + semester + "\n");

        // Table header
        System.out.println("**************");
        System.out.println("Subject\t\tMarks\t\tGrade");
        System.out.println("**************");

        // Subject details
        for (int i = 0; i < subjects.length; i++) {
            System.out.printf("%-15s\t%-8d\t%-4c\n", subjects[i], marks[i], grades[i]);
        }

        // Footer
        System.out.println("**************");
        System.out.println("\t\tEnd of Grade Sheet");
        System.out.println("**************");
    }
}