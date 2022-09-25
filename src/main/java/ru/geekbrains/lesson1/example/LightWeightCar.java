package ru.geekbrains.lesson1.example;

class LightWeightCar extends Car implements Moveable, Stopable { //implements Stopable
    @Override
    void open() {
        System.out.println("Car is open");
    }
    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void stop() {

    }
}