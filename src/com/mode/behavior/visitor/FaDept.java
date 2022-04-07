package com.mode.behavior.visitor;

/**
 * @Author admin
 * @Date 2022/3/17 17:46
 * @description
 */
public class FaDept extends Dept{
    private Integer wagesSum = 0;

    @Override
    public void visit(FullTimeEmployee employee) {
        //不管是临时工还是正式员工,计算工资总额
        wagesSum += employee.getWages();
    }

    @Override
    public void visit(PartTimeEmployee employee) {
        wagesSum += employee.getWages();
    }

    public Integer getWagesSum() {
        return wagesSum;
    }
}
