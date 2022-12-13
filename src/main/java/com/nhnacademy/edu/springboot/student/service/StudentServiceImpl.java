package com.nhnacademy.edu.springboot.student.service;

import com.nhnacademy.edu.springboot.student.model.Student;
import com.nhnacademy.edu.springboot.student.repository.StudentRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Student getStudent(Long id) {
        return studentRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("STUDENT NOT FOUND : ID = " + id));
    }

    @Transactional
    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Transactional
    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
