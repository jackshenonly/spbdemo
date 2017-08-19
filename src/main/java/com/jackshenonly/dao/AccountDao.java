package com.jackshenonly.dao;

import com.jackshenonly.entity.Account;
import com.sun.org.apache.bcel.internal.generic.ACONST_NULL;

import java.util.List;

/**
 * Created by jackshenonly on 17/8/13.
 */
public interface AccountDao {
    int add(Account account);
    int update(Account account);
    int delete(int id);
    Account findAccountById(int id);
    List<Account> findAll();
}
