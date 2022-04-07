package com.mode.behavior.state;

/**
 * @Author admin
 * @Date 2022/3/16 15:10
 * @description 正常状态
 */
public class NormalState extends AccountState{
    public NormalState(Account account) {
        this.account = account;
    }

    @Override
    public void deposit(Integer amount) {
        account.setBalance(account.getBalance() + amount);
    }

    @Override
    public void withdraw(Integer amount) {
        account.setBalance(account.getBalance() - amount);
        stateCheck();
    }
}
