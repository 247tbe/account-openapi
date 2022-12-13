package com.nhnacademy.edu.springboot.student.repository;

import com.nhnacademy.edu.springboot.student.model.Student;
import java.util.Optional;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    StudentRepository studentRepository;

    @Test
    void testStudentRepository() throws Exception {
        // given
        Student sehyun = new Student(1L, "sehyun", 111);
        studentRepository.save(sehyun);

        //when
        Optional<Student> actualStudent = studentRepository.findById(1L);

        // then
        Assertions.assertThat(actualStudent).isPresent();
        Assertions.assertThat(actualStudent).contains(sehyun);
    }
}
