package com.lesson.abstractiontask;

public class Triangle extends GeometricFigure{
    @Override
    void area() {
        System.out.println("Triangle area : SideA -> 12");
        System.out.println("Triangle area: SideB -> 14");
        System.out.println("Triangle area : SideC -> 15");
    }

    @Override
    void perimeter() {
        System.out.println("Triangle perimeter: SideA -> 10");
        System.out.println("Triangle perimeter:SideB -> 11");
        System.out.println("Triangle perimeter:SideC -> 9");
    }
}
