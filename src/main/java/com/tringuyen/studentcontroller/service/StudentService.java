package com.tringuyen.studentcontroller.service;

import com.tringuyen.studentcontroller.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    public void addStudent(Student student);
    public List<Student> getListStudent();
}
