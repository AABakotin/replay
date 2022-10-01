package ru.geekbrains.lesson1;

import ru.geekbrains.lesson1.builder.Person;
import ru.geekbrains.lesson1.polimorth.Circle;
import ru.geekbrains.lesson1.polimorth.Figure;
import ru.geekbrains.lesson1.polimorth.Square;
import ru.geekbrains.lesson1.polimorth.Triangle;

import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {

        Person person = new Person.PeronBuilder()
                .setFirstName("Anton")
                .setLastName("Bakotin")
                .setMiddleName("Alexandrovich")
                .setAge(33)
                .setGender("M")
                .setCountry("Moscow")
                .setAddress("Geekbrains 1")
                .setPhone("8800353533")
                .build();
        System.out.println(person);

        Stream.of(new Circle(10),
                new Square(5,6),
                new Triangle(6,7,8))
                .forEach(Figure::figureInfo);
    }
}
