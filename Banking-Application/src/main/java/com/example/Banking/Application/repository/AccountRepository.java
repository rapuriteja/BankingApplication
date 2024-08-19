package com.example.Banking.Application.repository;

import com.example.Banking.Application.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
