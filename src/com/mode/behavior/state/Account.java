package com.mode.behavior.state;

/**
 * @Author admin
 * @Date 2022/3/16 14:47
 * @description
 */
public class Account {
    private AccountState state;
    private Integer balance;

    public Account(Integer balance) {
        this.balance = balance;
        this.state = new NormalState(this);
        System.out.println("开户,初始余额为:" + balance);
    }

    public void deposit(Integer amount) {
        System.out.println("-------------------------");
        System.out.println("存款:" + amount);
        state.deposit(amount);
        System.out.println("存款后余额:" + balance);
    }

    public void withdraw(Integer amount) {
        System.out.println("------------------------");
        System.out.println("取款:" + amount);
        state.withdraw(amount);
        System.out.println("取款后余额:" + balance);
    }

    public AccountState getState() {
        return state;
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}
