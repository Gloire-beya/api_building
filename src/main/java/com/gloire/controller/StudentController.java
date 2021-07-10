package com.gloire.controller;

import com.gloire.model.Student;
import com.gloire.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents(){
       return studentService.getStudents();
    }

    @PostMapping
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }
    @PutMapping
    public void updateStudent(
            @PathVariable Long id,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email){

        studentService.updateStudent(id, name, email);
    }
    @DeleteMapping(path = "{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }
}
