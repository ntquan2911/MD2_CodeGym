import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VehicleManagement vehicleManagement = new VehicleManagement();
        while (true) {
            System.out.println("= = = = = = = =[ Menu ]= = = = = = = =");
            System.out.println("Press 1: Add a motorbike (Thêm xe máy): ");
            System.out.println("Press 2: Add a car (Thêm ô tô)");
            System.out.println("Press 3: Show information list (Hiển thị thông tin) ");
            System.out.println("Press 4: Find vehicle by OWNER (Tìm phương tiện = tên chủ phương tiện)");
            System.out.println("Press 5: Find vehicle by MODEL (Tìm phương tiện = tên xe)");
            System.out.println("Press 6: Edit info by OWNER (Sửa thông tin = tên chủ xe)");
            System.out.println("Press 7: Remove vehicle by OWNER (Xóa thông tin = tên chủ xe)");
            System.out.println("Press 8: Exit");
            System.out.println("= = = = = = = =[  ]= = = = = = = =");
            int choice = -1;

            while (choice == -1) {
                try {
                    choice = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("INPUT A NUMBER FROM 0 - 6");
                } finally {
                    scanner.nextLine();
                }
            }

            switch (choice) {
                case 1:
                    System.out.println("ENTER MOTOR'S INFO: ");
                    vehicleManagement.add(inputVehicle());
                    System.out.println("Enter capacity");
                    String capacity = scanner.nextLine();
                    break;
                case 2:
                    System.out.println("ENTER CAR'S INFO: ");
                    vehicleManagement.add(inputVehicle());
                    System.out.println("Enter seat");
                    int seat = scanner.nextInt();
                    System.out.println("Enter type");
                    String type = scanner.nextLine();
                    break;
                case 3:
                    System.out.println(vehicleManagement.showInfo());
                    break;
                case 4:
                    System.out.println("ENTER OWNER TO FIND");

                    break;
                case 5:
                    System.out.println("ENTER MODEL TO FIND");

                    break;

                case 6:
                    System.out.println("ENTER OWNER TO EDIT");
                    Vehicle editVehicle = inputVehicle();
                    vehicleManagement.edit(editVehicle.getOwner(), editVehicle);
                    break;

                case 7:
                    System.out.println("ENTER OWNER TO REMOVE");
                    String owner = scanner.nextLine();
                    vehicleManagement.remove(owner);
                    break;

                default:
                    System.exit(0);
            }
        }
    }

    public static Vehicle inputVehicle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter owner");
        String owner = scanner.nextLine();
        System.out.println("Enter mark");
        String mark = scanner.nextLine();
        System.out.println("Enter model");
        String model = scanner.nextLine();
        System.out.println("Enter year");
        String year = scanner.nextLine();
        System.out.println("Enter color");
        String color = scanner.nextLine();
        System.out.println("Enter price");
        double price = scanner.nextDouble();
        return new Vehicle(owner, mark, model, year, color, price);
    }

}

