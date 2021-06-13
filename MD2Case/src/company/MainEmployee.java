package company;

import employee.*;

import java.io.File;
import java.util.Scanner;

public class MainEmployee {

    private static final EmployeeManagement employeeManagement = new EmployeeManagement();

    public static void menu() {
        draw();
        System.out.printf("%-70s%-50s%-40s%10s" + "\n", "|", "QUẢN LÍ NHÂN VIÊN", "", "|");
        System.out.println("1. Thêm thông tin developer");
        System.out.println("2. Thêm thông tin tester");
        System.out.println("3. Thêm thông tin ke toan");
        System.out.println("4. Thêm thông tin bao ve");
        System.out.println("5. Hiển thị danh sách nhân viên");
        System.out.println("6. Sửa thông tin nhân viên");
        System.out.println("7. Xóa thông tin nhân viên");
        System.out.println("8. Sắp xếp lương nhân viên");
        System.out.println("9. Hiển thị tổng lương phải trả");
        System.out.println("10. Tìm kiếm nhân viên theo ID");
//        System.out.println("11. Đọc ra File");
//        System.out.println("12. Ghi ra File");
        draw();
    }

    private static void draw() {
        for (int i = 0; i < 170; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String choice;
        ReadWriteFile readWriteFile = new ReadWriteFile();

        File file = new File(employeeManagement.getPath());
        do {
            if (file.length() > 0) {
                employeeManagement.setEmployees();
            }
            menu();
            choice = sc.next();
            switch (choice) {
                case "1": {
                    Developer developer = new Developer();
                    employeeManagement.addInfo(developer);
                    break;
                }
                case "2": {
                    Tester tester = new Tester();
                    employeeManagement.addInfo(tester);
                    break;
                }
                case "3": {
                    Accountant accountant = new Accountant();
                    employeeManagement.addInfo(accountant);
                    break;
                }
                case "4": {
                    Security security = new Security();
                    employeeManagement.addInfo(security);
                    break;
                }
                case "5": {
                    employeeManagement.showList();
                    break;
                }
                case "6": {
                    employeeManagement.editInfoById();
                    break;
                }
                case "7": {
                    employeeManagement.deleteInfo();
                    break;
                }
                case "8": {
                    employeeManagement.sortSalary();
                    break;
                }
                case "9": {
                    System.out.println("TỔNG TIỀN LƯƠNG PHẢI TRẢ: " + employeeManagement.getTotalSalary());
                    break;
                }
                case "10": {
                    employeeManagement.findEmployeeById();
                    break;
                }

//                case "11":
//                    readWriteFile.readDataFromFile("Info.txt");
//                    break;
//                case "12":
//                    readWriteFile.writeDataToFile("Info.txt",employeeManagement.getEmployeeList());
//                    break;
                case "0": {
                    break;
                }
                default: {
                    System.err.print("Không có sự lựa chọn này\n");
                }
            }
        } while (!choice.equals("0"));

    }

}

