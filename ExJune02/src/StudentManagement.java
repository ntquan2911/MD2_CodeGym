import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    private List<Student> studentList;

    public StudentManagement() {
        this.studentList = new ArrayList<>();
        this.studentList.add(new Student(1, "A", "01/01/1992", "male", "Ha Noi", "a.nguyen@codegym.vn", 7.0));
        this.studentList.add(new Student(2, "B", "02/92/1993", "female", "Ha Dong", "b.tran@codegym.vn", 8.5));
        this.studentList.add(new Student(3, "C", "03/03/1994", "male", "Ha Nam", "c.pham@codegym.vn", 9.0));
    }

    public String showInfo() {
        String str = "";
        for (Student student : this.studentList) {
            str += str.toString();
        }
        return str;
    }

    public void add (Student student) {
        this.studentList.add(student);
        System.out.println("Added success");
    }

    public int findById (int id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void edit (int id, Student student) {
        if (findById(id) == -1) {
            System.out.println("THIS ID IS NOT AVAILABLE");
        } else {
            studentList.set(findById(id), student);
            System.out.println("Edited success");
        }
    }

    public void remove (int id) {
        if (findById(id) == -1) {
            System.out.println("THIS ID IS NOT AVAILABLE");
        } else {
            studentList.remove(findById(id));
            System.out.println("Removed success");
        }
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
