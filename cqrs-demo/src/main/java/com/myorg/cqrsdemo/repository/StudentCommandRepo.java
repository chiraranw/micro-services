package com.myorg.cqrsdemo.repository;

import com.myorg.cqrsdemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentCommandRepo extends JpaRepository<Student,Long> {
}
