package com.nhnacademy.edu.springboot.student.service;

import com.nhnacademy.edu.springboot.student.model.Account;
import com.nhnacademy.edu.springboot.student.repository.AccountRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Account> getAccounts() {
        return accountRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Account getAccount(Long id) {
        return accountRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("ACCOUNT NOT FOUND : ID = " + id));
    }

    @Transactional
    @Override
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    @Transactional
    @Override
    public void deleteStudent(Long id) {
        accountRepository.deleteById(id);
    }
}
