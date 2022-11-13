package com.tringuyen.studentcontroller.controller;

import com.tringuyen.studentcontroller.model.Student;
import com.tringuyen.studentcontroller.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeComtroller {
    @Autowired
    StudentService studentService;

    @PostMapping("/api/add-student")
    public Object addStudent(@RequestParam("name") String name, @RequestParam("age") int age){
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        studentService.addStudent(student);
        return  studentService.getListStudent();
    }

    @PostMapping("/api/add-student-2/{name}/{age}")
    public Object addStudentUsePathVariable(@PathVariable String name, @PathVariable int age){
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        studentService.addStudent(student);
        return  studentService.getListStudent();
    }

    @PostMapping("/api/add-student-3")
    public Object addStudentUseRequestBody(@RequestBody Student student){
        studentService.addStudent(student);
        return  studentService.getListStudent();
    }
}
