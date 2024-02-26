package org.example.service;

import org.example.entity.Student;
import org.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repo;
    @Override
    public Student insertStudent(Student student) {
        return repo.save(student);
    }
    @Override
    public List<Student> insertStudents(List<Student> studentList) {
        return repo.saveAll(studentList);
    }
    @Override
    public Student selectStudentById(int id) {
        return repo.findById(id).orElse(null);
    }
    @Override
    public List<Student> selectAllStudent() {
        return repo.findAll();
    }

    @Override
    public Student updateStudent(Student student) {
        return repo.save(student);
    }

    @Override
    public List<Student> updateAllStudent(List<Student> studentList) {
        return repo.saveAll(studentList);
    }
    @Override
    public Boolean deleteStudentById(int id) {
        repo.deleteById(id);
        return true;
    }

    @Override
    public Boolean deleteAllStudent() {
         repo.deleteAll();
         return true;
    }
}
