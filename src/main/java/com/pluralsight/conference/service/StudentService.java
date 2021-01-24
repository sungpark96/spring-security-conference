package com.pluralsight.conference.service;


import com.pluralsight.conference.Exception.StudentNotFoundException;
import com.pluralsight.conference.dao.StudentDao;
import com.pluralsight.conference.model.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.function.Supplier;

@Service
public class StudentService {
    private final StudentDao studentDao;

    private static final Supplier<StudentNotFoundException> STUDENT_NOT_FOUND =
            () -> new StudentNotFoundException("Student not found!");

    @Autowired
    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void insertStudent(Student student) {
        studentDao.insertData(student);
    }

    public Student get(int id) {
//        if studentDao.get(id) = null --> orElseThrow
        return studentDao.get(id).orElseThrow(STUDENT_NOT_FOUND);
    }
}