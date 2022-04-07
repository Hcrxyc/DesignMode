package com.mode.behavior.visitor;

/**
 * @Author admin
 * @Date 2022/3/17 17:42
 * @description
 */
public class HrDept extends Dept {

    private Integer employeeCount = 0;

    @Override
    public void visit(FullTimeEmployee employee) {
        //只计算正式员工数量
        employeeCount += 1;
    }

    @Override
    public void visit(PartTimeEmployee employee) {

    }

    public Integer getEmployeeCount() {
        return employeeCount;
    }
}
