package com.mvc.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mvc.Entity.Student;
import com.mvc.Repository.StudentRepo;

@Service
public class StudentService {

    private final StudentRepo repo;

    public StudentService(StudentRepo repo) {
        this.repo = repo;
    }

    // Save Student
    public Student SaveStudent(Student student) {
        return repo.save(student);
    }

    // Display All Students
    public List<Student> GetAllStudent() {
        return repo.findAll();
    }

    // Get Student By Id (Edit)
    public Student editStudentById(Integer Id) {
        return repo.findById(Id).orElse(null);
    }

    // Update Student
    public Student updateStudent(Student student) {
        return repo.save(student);
    }

    // Delete Student
    public void deleteStudentById(Integer Id) {
        repo.deleteById(Id);
    }

}