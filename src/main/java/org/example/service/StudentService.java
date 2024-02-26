package org.example.service;

import org.example.entity.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface StudentService {

     Student insertStudent(Student student);
     List<Student> insertStudents(List<Student> studentList);
     Student selectStudentById(int id);
     List<Student> selectAllStudent();
     Student updateStudent(Student student);
     List<Student> updateAllStudent(List<Student> studentList);
     Boolean deleteStudentById(@PathVariable int id);
     Boolean deleteAllStudent();
}
