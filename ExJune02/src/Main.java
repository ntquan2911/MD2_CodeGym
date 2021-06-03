import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagement studentManagement = new StudentManagement();
        while (true) {
            System.out.println("======Menu=====");
            System.out.println("Press 1: ADD STUDENT");
            System.out.println("Press 2: SHOW STUDENT LIST");
            System.out.println("Press 3: FIND STUDENT BY ID");
            System.out.println("Press 4: REMOVE STUDENT BY ID");
            System.out.println("Press 5: EDIT STUDENT'S INFO");
            System.out.println("Press 6: SORT STUDENT LIST");
            System.out.println("Press 0: EXIT");
            int choice = -1;
            while (choice == -1) {
                try {
                    choice = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("IN PUT A NUMBER FROM 0 - 6");
                } finally {
                    scanner.nextLine();
                }
            }

            switch (choice) {
                case 1:
                    System.out.println("ENTER STUDENT INFO");
                    studentManagement.add(inputStudent());
                    break;
                case 2:
                    System.out.println(studentManagement.showInfo());
                    break;
                case 3:
                    System.out.println("ENTER ID TO FIND");
                    int idFind = scanner.nextInt();
                    Student studenFind = studentManagement.getStudentList().get(studentManagement.findById(idFind));
                    System.out.println(studenFind);
                    break;
                case 5:
                    System.out.println("ENTER ID TO EDIT");
                    Student editPerson = inputStudent();
                    studentManagement.edit(editPerson.getId(), editPerson);
                    break;
                case 4:
                    System.out.println("ENTER ID TO REMOVE");
                    int id = scanner.nextInt();
                    studentManagement.remove(id);
                    break;

                case 6:

                default:
                    System.exit(0);
            }
        }
    }

    public static Student inputStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER ID");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("ENTER NAME:");
        String name = scanner.nextLine();
        System.out.println("ENTER DOB");
        String dob = scanner.nextLine();
        System.out.println("ENTER GENDER");
        String gender = scanner.nextLine();
        System.out.println("ENTER ADDRESS");
        String address = scanner.nextLine();
        System.out.println("ENTER EMAIL");
        String email = scanner.nextLine();
        System.out.println("ENTER AVG MARK");
        double avgMark = scanner.nextDouble();
        return new Student(id, name, dob, gender, address, email, avgMark);
    }
}
