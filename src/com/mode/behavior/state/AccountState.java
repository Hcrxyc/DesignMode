package com.mode.behavior.state;

/**
 * @Author admin
 * @Date 2022/3/16 14:34
 * @description
 */
public abstract class AccountState {
    protected Account account;
    public abstract void deposit(Integer amount);
    public abstract void withdraw(Integer amount);

    public void stateCheck(){
        if (account.getBalance() < 0) {
            account.setState(new RestrictedState(account));
        }else{
            account.setState(new NormalState(account));
        }
    }
}
