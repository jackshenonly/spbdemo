package com.jackshenonly.service;

import com.jackshenonly.entity.Account;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jackshenonly on 17/8/13.
 */
public interface AccountService {
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
