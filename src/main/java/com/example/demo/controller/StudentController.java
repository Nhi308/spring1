package com.example.demo.controller;

import com.example.demo.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    List<Student> students = new ArrayList<>();

    @PostMapping("/add-student-1")
    public List<Student> addStudent1(@RequestParam("name") String name,
                               @RequestParam("age") int age) {
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        System.out.println("Name: " + name + " - Age: " + age);
        students.add(student);
        return students;
    }

    @PostMapping("/add-student-2")
    public List<Student> addStudent2(@PathVariable("name") String name,
                               @PathVariable("age") int age) {
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        System.out.println("Name: " + name + " - Age: " + age);
        return students;
    }

    @PostMapping("/add-student-3")
    public List<Student> addStudent3(@RequestBody Student student) {
        System.out.println("Name: " + student.getName() + " - Age: " + student.getAge());
        students.add(student);
        return students;
    }

}
