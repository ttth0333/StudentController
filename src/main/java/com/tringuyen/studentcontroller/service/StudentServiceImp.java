package com.tringuyen.studentcontroller.service;

import com.tringuyen.studentcontroller.model.Student;
import com.tringuyen.studentcontroller.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImp implements StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Override
    public void addStudent(Student student) {
        studentRepository.addStudent(student);
    }

    @Override
    public List<Student> getListStudent() {
        return studentRepository.getListStudent();
    }
}
