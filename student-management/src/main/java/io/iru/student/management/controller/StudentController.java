package io.iru.student.management.controller;

import io.iru.student.management.entity.Student;
import io.iru.student.management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.persistence.EntityManager;
import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/getMessage")
    public String getGreetingMessage(){
        return "Hi! WelCome to Student Management System!";
    }
    @PostMapping("/student")
    public ResponseEntity<Student> addStudent(@Valid @RequestBody Student student){
        Student savedStudent = studentService.addStudent(student);

        URI location = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(savedStudent.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    /*@GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable int id){

        System.out.println("#### Id :"+id);

        Student student = studentService.getStudentById(id);

        System.out.println("#### student :"+student.toString());

        return student;

    }*/

    @GetMapping("/student/{id}")
    public Student findStudentById(@PathVariable int id){

        System.out.println("#### Id :"+id);

        Student student = studentService.findStudentById(id);

        System.out.println("#### student :"+student.toString());

        return student;

    }

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        List<Student> students = studentService.getAllStudents();
        return students;
    }

}
