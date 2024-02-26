package org.example.controller;

import org.example.entity.Student;
import org.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService service;

    @PostMapping("/insertStudent")
    public Student insertStudent(@RequestBody Student student) {
        return service.insertStudent(student);
    }
    @PostMapping("/insertStudents")
    public List<Student> insertStudents(@RequestBody List<Student> studentList) {
        return service.insertStudents(studentList);
    }

    @GetMapping("/selectStudent/{id}")
    public Student selectStudentById(@PathVariable int id) {
        return service.selectStudentById(id);
    }
    @GetMapping("/selectStudents")
    public List<Student> selectAllStudent() {
        return service.selectAllStudent();
    }

    @PutMapping("/updateStudent/{id}")
    public Student updateStudent(@RequestBody Student student) {
        return service.updateStudent(student);
    }

    @PutMapping("/updateAllStudent")
    public List<Student> updateAllStudent(@RequestBody List<Student> studentList){
        return service.updateAllStudent(studentList);
    }
    @DeleteMapping("/deleteStudent/{id}")
    public Boolean deleteStudentById(@PathVariable int id){
        return service.deleteStudentById(id);
    }
    @DeleteMapping("/deleteAllStudent")
    public Boolean deleteAllStudent(){
        return service.deleteAllStudent();
    }

}
