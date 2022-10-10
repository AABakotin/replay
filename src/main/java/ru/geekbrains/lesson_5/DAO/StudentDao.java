package ru.geekbrains.lesson_5.DAO;

import ru.geekbrains.lesson_5.entities.Student;

import java.util.List;
import java.util.Optional;

public interface StudentDao {

    void save(Student student);

    Optional<Student> getById(int id);

    List<Student> getAll();

    void deleteById(int id);

    void update(Student student);
}
