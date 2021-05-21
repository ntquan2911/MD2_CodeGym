package Bai2;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student(1,"Nguyen Tien Quan", 9.5f, 10.0f);
        Student student2 = new Student(2, "Nguyen Phan An Nguyen", 8.0f, 9.0f);
        Student student3 = new Student();

        student3.inputData();
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
    }
}
