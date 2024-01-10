package com.lesson.abstractiontask;

public class Trapezium extends GeometricFigure {
    @Override
    void area() {
        System.out.println("Trapezium area: SideA -> 8");
        System.out.println("Trapezium area: SideB -> 9");
        System.out.println("Trapezium area :High -> 20");
    }

    @Override
    void perimeter() {
        System.out.println("Trapezium perimeter : SideA -> 21");
        System.out.println("Trapezium perimeter:  SideB -> 22");
        System.out.println("Trapezium perimeter: High -> 25");

    }
}
