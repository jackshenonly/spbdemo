package com.jackshenonly.controller;

import com.jackshenonly.entity.Account;
import com.jackshenonly.service.AccountService;
import com.jackshenonly.spbdemo.interfaces.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jackshenonly on 17/8/13.
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;


    @ResponseBody
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Account> getList(){
        return accountService.findAccountList();
    }


}
