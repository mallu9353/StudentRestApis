package com.springboot.controller;
import  com.springboot.services.studentService;
import com.springboot.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class studentController {

    @Autowired
    studentService stser;

    //add student
    @PostMapping()
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        stser.addStudent(student);
        return ResponseEntity.ok(student);
       // return new ResponseEntity<>(student, HttpStatus.CREATED);

    }

    //getallstudent
    @GetMapping()
    public ResponseEntity<List<Student>> getAllStudent(){
        List<Student> students=stser.getAll();
        return ResponseEntity.ok(students);
    }

    //get student by id

    @GetMapping("/{id}")
    public  ResponseEntity<Student> getStudent(@PathVariable Long id){
        Student st=stser.getStudent(id);
        return ResponseEntity.ok(st);

    }

    //delete student
    @DeleteMapping("/{id}")
    public ResponseEntity<Student> deleteStudent(@PathVariable Long id){
        Student st=stser.deleteStudent(id);
        return ResponseEntity.ok(st);
    }

    @PutMapping
    public ResponseEntity<Student> updateStudent(@RequestBody Student student){
        stser.updateStudent(student);
        return ResponseEntity.ok(student);

    }






}
