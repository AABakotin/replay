package ru.geekbrains.lesson7;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentsService {

    private StudentsRepository studentsRepository;

    @Autowired
    public void setStudentsRepository(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    public StudentsService() {
    }

    public List<Student> getAllStudentsList() {
        return (List<Student>)studentsRepository.findAll();
    }

    public void addStudent(Student s) {
        studentsRepository.save(s);
    }

    public void removeById(Long id) {
        studentsRepository.deleteById(id);
    }

    public Optional<Student> getStudentById(Long id) {
        return studentsRepository.findById(id);
    }


    public void removeStudent(Long studentId) {
        Optional<Student> student = studentsRepository.findById(studentId);
        studentsRepository.deleteById(student.get().getId());
    }
}