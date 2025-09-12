class Student {
    private int ID;
    private String name;
    private String branch;
    private String city;
    private String university;

    public Student(int ID) {
        this.ID = ID;
    }

    public Student(int ID, String name) {
        this(ID);
        this.name = name;
    }

    public Student(int ID, String name, String branch) {
        this(ID, name);
        this.branch = branch;
    }

    public Student(int ID, String name, String branch, String city) {
        this(ID, name, branch);
        this.city = city;
    }

    public Student(int ID, String name, String branch, String city, String university) {
        this(ID, name, branch, city);
        this.university = university;
    }

    public void display() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("City: " + city);
        System.out.println("University: " + university);
    }
}

class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student(123);
        student1.display();

        System.out.println();

        Student student2 = new Student(456, "John Doe");
        student2.display();

        System.out.println();

        Student student3 = new Student(789, "Jane Smith", "Computer Science");
        student3.display();

        System.out.println();

        Student student4 = new Student(101, "Alice Johnson", "Electrical", "New York");
        student4.display();

        System.out.println();

        Student student5 = new Student(202, "Bob Williams", "Mechanical", "Chicago", "XYZ University");
        student5.display();
    }
}
