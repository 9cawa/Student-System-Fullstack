package com.aksenov.studentsystem.service;

import com.aksenov.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);
    List<Student> getAllStudents();
}
