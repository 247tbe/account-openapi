package com.nhnacademy.edu.springboot.student.repository;

import com.nhnacademy.edu.springboot.student.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
