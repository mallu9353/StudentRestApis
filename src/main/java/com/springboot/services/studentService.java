package com.springboot.services;


import com.springboot.model.Student;

import java.util.List;

public interface studentService {
    void addStudent(Student student);

    List<Student> getAll();

    Student getStudent(Long id);

    Student deleteStudent(Long id);

    void updateStudent(Student student);
}
