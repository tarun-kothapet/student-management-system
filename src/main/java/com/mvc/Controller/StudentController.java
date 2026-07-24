package com.mvc.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.Entity.Student;
import com.mvc.Service.StudentService;

@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    // Open Registration Page
    @GetMapping("/")
    public ModelAndView home() {

        ModelAndView mav = new ModelAndView();

        mav.addObject("student", new Student());

        mav.setViewName("Register");

        return mav;
    }

    // Save Student
    @PostMapping("/Register")
    public String saveStudent(@ModelAttribute Student student) {

        service.SaveStudent(student);

        return "redirect:/Students";
    }

    // Display All Students
    @GetMapping("/Students")
    public ModelAndView viewStudents() {

        ModelAndView mav = new ModelAndView();

        mav.addObject("students", service.GetAllStudent());

        mav.setViewName("Students");

        return mav;
    }

    // Open Edit Page
    @GetMapping("/edit/{Id}")
    public ModelAndView editStudent(@PathVariable Integer Id) {

        ModelAndView mav = new ModelAndView();

        Student student = service.editStudentById(Id);

        mav.addObject("student", student);

        mav.setViewName("EditStudent");

        return mav;
    }

    // Update Student
    @PostMapping("/update")
    public String updateStudent(@ModelAttribute Student student) {

        service.updateStudent(student);

        return "redirect:/Students";
    }

    // Delete Student
    @GetMapping("/delete/{Id}")
    public String deleteStudent(@PathVariable Integer Id) {

        service.deleteStudentById(Id);

        return "redirect:/Students";
    }

}