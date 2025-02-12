class University {
    static String universityName = "ABC University"; 
    String studentName; 

    University(String name) {
        studentName = name;
    }

    static void displayUniversityName() {
        System.out.println("University: " + universityName);
    }

    public static void main(String[] args) {
        University student1 = new University("Lucky");
        University student2 = new University("Lovenesh");

        student1.displayUniversityName();
        System.out.println("Student 1: " + student1.studentName);

        student2.displayUniversityName();
        System.out.println("Student 2: " + student2.studentName);

        System.out.println("All students belong to: " + University.universityName);
    }
}
