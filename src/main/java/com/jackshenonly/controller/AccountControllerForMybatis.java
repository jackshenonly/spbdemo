package com.jackshenonly.controller;

import com.jackshenonly.spbdemo.entity.Account;
import com.jackshenonly.spbdemo.entity.AccountExample;
import com.jackshenonly.spbdemo.interfaces.AccountMapper;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by jackshenonly on 17/8/13.
 */
@RestController
@RequestMapping("/mybatis/account")
public class AccountControllerForMybatis {
    @Autowired
    AccountMapper accountMapper;


    @ApiOperation(value = "")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Account getAccount(@PathVariable("id") int id){
        Account account = accountMapper.selectByPrimaryKey(id);
        return account;
    }

    @ApiOperation(value = "")
    @RequestMapping("/para")
    @ResponseBody
    public Account getByid(@RequestParam(value = "id") int id){
        Account account = accountMapper.selectByPrimaryKey(id);
        return account;
    }

    @ApiOperation(value = "")
    @ResponseBody
    @RequestMapping("/all")
    public List<Account> getAll(){
        return accountMapper.selectByExample(new AccountExample());
    }

    @RequestMapping(value = "/update")
    public String updateById(@RequestParam("id") int id,
                             @RequestParam("name") String name,
                             @RequestParam("money") Double money ){

        Account account = new Account();
        account.setId(id);
        account.setName(name);
        account.setMoney(money);
        int result = accountMapper.updateByPrimaryKey(account);
        if(result == 1){
            return "SUCCESS";
        }else {
            return "FAILED!";
        }
    }

    @Transactional
    @RequestMapping("/trans")
    public String trans(@RequestParam("in") int in,
                        @RequestParam("out") int out,
                        @RequestParam("money") Double money) throws Exception{

        accountMapper.trans(out,-1*money);
        int a = 1/0;
        accountMapper.trans(in,money);

        return "trans Success";
    }

}
