package com.example.demo.service;


import com.example.demo.dto.StudentDto;
import com.example.demo.model.Student;

import java.util.List;

public interface StudentService {
    //CRUD
    Student save(StudentDto student);
    List<StudentDto> list();
    StudentDto findById(Long id);
    void remove(Long id);
}
