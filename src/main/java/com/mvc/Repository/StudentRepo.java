package com.mvc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mvc.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
