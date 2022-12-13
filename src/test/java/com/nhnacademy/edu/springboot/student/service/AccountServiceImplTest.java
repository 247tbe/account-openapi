package com.nhnacademy.edu.springboot.student.service;

import static org.junit.jupiter.api.Assertions.*;

import com.nhnacademy.edu.springboot.student.model.Account;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AccountServiceImplTest {
    @Autowired
    AccountServiceImpl accountService;

    @Test
    void getAllAccounts() {
        List<Account> accountList = accountService.getAccounts();

        Assertions.assertThat(accountList).hasSize(2);
    }
}