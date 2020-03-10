package com.myorg.cqrsdemo.service;

import com.myorg.cqrsdemo.model.Student;
import com.myorg.cqrsdemo.repository.StudentCommandRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentCommandService {

    //Only write commands this side

    @Autowired
    private StudentCommandRepo studentCommandRepo;

    public Student create(Student student) {
        this.studentCommandRepo.save(student);
        return student;
    }

    public Long delete(Student student){
        this.studentCommandRepo.delete(student);
        return  student.getId();
    }

    public Student update(Student student, String name){
        //some update logic
        this.studentCommandRepo.save(student);
        return student;
    }

}
