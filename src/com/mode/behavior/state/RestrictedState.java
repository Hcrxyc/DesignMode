package com.mode.behavior.state;

/**
 * @Author admin
 * @Date 2022/3/16 15:01
 * @description 受限状态
 */
public class RestrictedState extends  AccountState{
    public RestrictedState(Account account) {
        this.account = account;
    }

    @Override
    public void deposit(Integer amount) {
        account.setBalance(account.getBalance() + amount);
        stateCheck();
    }

    @Override
    public void withdraw(Integer amount) {
        System.out.println("账号受限,无法取款");
    }
}
