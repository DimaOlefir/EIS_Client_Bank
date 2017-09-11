package com.eisgroup.cb.service;

import com.eisgroup.cb.model.Account;
import com.eisgroup.cb.model.Status;

import java.util.List;

/**
 * Created by Titarenko on 31.05.2017 at 15:03.
 */
public interface AccountService {
    void save(Account account);

    Account findById(Long id);

    Long generateAccountNumber(Account.Type type);

    Account findByAccountNumber(Long accountNumber);

    Account getClone(Account original);

    List<Account> filterByStatus(List<Account> target, Status status);
}