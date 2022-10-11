package ru.geekbrains.lesson7;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentsRepository extends CrudRepository<Student, Long> {

    @Override
    void deleteById(Long aLong);

    @Override
    Student save(Student student);

    @Override
    List<Student> findAll();

    @Override
    Optional<Student> findById(Long id);

}
