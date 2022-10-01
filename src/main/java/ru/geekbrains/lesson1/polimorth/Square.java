package ru.geekbrains.lesson1.polimorth;

public class Square extends Figure {

    private final int sideA;
    private final int sideB;

    public Square(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void figureInfo() {
        System.out.println("Периметр квадрата: " + perimeter());
    }

    private int perimeter() {
        return (sideA + sideB) * 2;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}
