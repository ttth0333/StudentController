package com.tringuyen.studentcontroller.repository;

import com.tringuyen.studentcontroller.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImp implements StudentRepository {
    List<Student> list = new ArrayList<>();
    @Override
    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public List<Student> getListStudent() {
        return list;
    }
}
