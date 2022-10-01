package ru.geekbrains.lesson1.polimorth;

public class Circle extends Figure{

    private double Radius;

    public Circle(int radius) {
        Radius = radius;
    }

    @Override
   public void figureInfo() {
        System.out.println("Периметр круга " + perimeter());
    }

    private double perimeter() {
        return 2*3.14*Radius;
    }

    public double getRadius() {
        return Radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Radius=" + Radius +
                '}';
    }
}
