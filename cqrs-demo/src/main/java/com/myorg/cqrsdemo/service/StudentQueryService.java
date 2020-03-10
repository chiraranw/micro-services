package com.myorg.cqrsdemo.service;


import com.myorg.cqrsdemo.model.Student;
import com.myorg.cqrsdemo.repository.StudentQueryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentQueryService {

    List<Student> students = Arrays.asList(
            new Student(1l, "Nation"),
            new Student(2l, "James")
    );

    //Only queries this side
    @Autowired
    private StudentQueryRepo studentQueryRepo;

    public List<Student> getAll() {
        return this.students;
    }

    public Student getStudent(Long id) {
        return this.studentQueryRepo.getOne(id);
    }

    /**
     * Some extra methods for reporting, etc
     */


}
