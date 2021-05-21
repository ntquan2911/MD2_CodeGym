package Bai1;

import java.util.Scanner;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length: ");
        this.length = scanner.nextDouble();
        System.out.println("Enter width: ");
        this.width = scanner.nextDouble();
    }

    @Override
    public String toString() {
        return "Rectangle {" +
                "length = " + length +
                ", width = " + width +
                '}' + "\n" +
                "Perimeter: " + getPerimeter() + "\n" +
                "Area: " + getArea();
    }
}
