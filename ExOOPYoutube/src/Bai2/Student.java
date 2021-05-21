package Bai2;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private float markLT;
    private float markTH;

    public Student() {
    }

    public Student(int id, String name, float markLT, float markTH) {
        this.id = id;
        this.name = name;
        this.markLT = markLT;
        this.markTH = markTH;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMarkLT() {
        return markLT;
    }

    public void setMarkLT(float markLT) {
        this.markLT = markLT;
    }

    public float getMarkTH() {
        return markTH;
    }

    public void setMarkTH(float markTH) {
        this.markTH = markTH;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        this.id = scanner.nextInt();
        System.out.println("Enter name:");
        this.name = scanner.nextLine();
        System.out.println("Enter mark LT: ");
        this.markLT = scanner.nextFloat();
        System.out.println("Enter mark TH: ");
        this.markTH = scanner.nextFloat();
    }
    public float getAverageMark() {
        return (markLT + markTH * 2) / 3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", markLT=" + markLT +
                ", markTH=" + markTH +
                '}' +
                "Average is: " + getAverageMark();
    }
}
