package com.springboot.services;

import com.springboot.model.Student;
import com.springboot.repository.studentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentServiceImpl implements studentService{

    @Autowired
    studentRepo strepo;

    @Override
    public void addStudent(Student student) {
        strepo.save(student);

    }

    @Override
    public List<Student> getAll() {
       return strepo.findAll();
    }

    @Override
    public Student getStudent(Long id) {
        return strepo.findById(id).orElse(null);
    }

    @Override
    public Student deleteStudent(Long id) {
        Student st=strepo.findById(id).orElse(null);
       strepo.deleteById(id);
       return st;
    }

    @Override
    public void updateStudent(Student student) {
        strepo.save(student);
    }
}
