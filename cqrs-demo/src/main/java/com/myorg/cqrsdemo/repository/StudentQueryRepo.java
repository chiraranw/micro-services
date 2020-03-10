package com.myorg.cqrsdemo.repository;

import com.myorg.cqrsdemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentQueryRepo extends JpaRepository<Student,Long> {
}
