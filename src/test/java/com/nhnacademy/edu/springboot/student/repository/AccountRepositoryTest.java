package com.nhnacademy.edu.springboot.student.repository;

import com.nhnacademy.edu.springboot.student.model.Account;
import java.util.List;
import java.util.Optional;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AccountRepositoryTest {
    @Autowired
    AccountRepository accountRepository;

    @Test
    void testAccountRepository() {
        // given
        Account account = new Account(1L, "123456-00-123456", 1_000_000);
        accountRepository.save(account);

        // when
        Optional<Account> actual = accountRepository.findById(1L);

        // then
        Assertions.assertThat(actual).isPresent();
        Assertions.assertThat(actual).contains(account);

    }
}
