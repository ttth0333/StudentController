package com.tringuyen.studentcontroller.repository;

import com.tringuyen.studentcontroller.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository {
    public void addStudent(Student student);

    public List<Student> getListStudent();
}

