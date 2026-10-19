class Student{
    int rollno;
    String name;
    int marks;
}

public class StudentArray {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Aman";
        s1.marks = 88;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Raman";
        s2.marks = 78;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "pooja";
        s3.marks = 90;

        Student[] students = {s1, s2, s3};

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " : " + students[i].marks + "  ");
        }
    }
}
    
