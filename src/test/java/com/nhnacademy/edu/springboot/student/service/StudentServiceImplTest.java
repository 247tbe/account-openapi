package com.nhnacademy.edu.springboot.student.service;

import static org.junit.jupiter.api.Assertions.*;

import com.nhnacademy.edu.springboot.student.model.Student;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentServiceImplTest {
    @Autowired
    StudentServiceImpl studentService;

    @Test
    void getAllStudents() {
        // when
        List<Student> students = studentService.getStudents();

        // then
        Assertions.assertThat(students).hasSize(1);
    }
}