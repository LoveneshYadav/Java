class Student {
    String name;
    int age;

    public Student() //default 
    {
        this.name = "Name";
        this.age = 28;
    }

    public Student(String name, int age) //parameterise Constructor
    {
        this.name = name;
        this.age = age;
    }

     void display() 
    {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) 
    {
        //Student student1 = new Student();
        //student1.display();

        Student student2 = new Student("Lovenesh", 19);
        student2.display();
    }
}
