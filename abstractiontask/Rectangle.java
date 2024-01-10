package com.lesson.abstractiontask;

public class Rectangle extends GeometricFigure{
    @Override
    void area() {
        System.out.println("Rectangle area: SideA -> 10");
        System.out.println("Rectangle area :SideB -> 11");
    }

    @Override
    void perimeter() {
        System.out.println("Rectangle perimeter: SideA-> 26");
        System.out.println("Rectangle perimeter: SideB -> 28");

    }
}
