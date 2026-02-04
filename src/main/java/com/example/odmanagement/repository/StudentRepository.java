package com.example.odmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.odmanagement.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
    // This allows the Controller to find your 69 students
}