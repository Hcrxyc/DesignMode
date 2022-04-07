package com.mode.create.factory.abstractf;

/**
 * @Author admin
 * @Date 2022/3/2 15:48
 * @description
 */
public class AppleFactory implements ComputerFactory{
    @Override
    public Computer createComputer() {
        return new AppleComputer();
    }

    @Override
    public Software createSoftware() {
        return new AppleSoftware();
    }
}
