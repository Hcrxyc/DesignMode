package com.mode.create.factory.func;


import com.mode.create.factory.AppleComputer;
import com.mode.create.factory.Computer;

/**
 * @Author admin
 * @Date 2022/3/2 14:22
 * @description
 */
public class AppleComputerFactory implements ComputerFactory{
    @Override
    public Computer createComputer() {
        return new AppleComputer();
    }
}
