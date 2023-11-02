package io.iru.student.management.service;

import io.iru.student.management.entity.Student;
import io.iru.student.management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public Student addStudent(Student student){

        Student savedstudent = studentRepository.save(student);

        return savedstudent;

    }

   public Student getStudentById(int id){
        Student student = studentRepository.getReferenceById(id);

        return student;
    }

    public List<Student> getAllStudents(){
        List<Student> students = studentRepository.findAll();

        return students;
    }

    public Student findStudentById(int id){
        Student student = studentRepository.findStudentById(id);

        return student;
    }
}
