package com.mode.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author admin
 * @Date 2022/3/17 17:32
 * @description
 */
public class EmployeeList {
    private List<Employee> employeeList = new ArrayList<>();

    public void add(Employee employee) {
        employeeList.add(employee);
    }

    public void remove(Employee employee) {
        employeeList.remove(employee);
    }

    //遍历访问员工集合中的每一个员工对象
    public void accept(Dept handler) {
        for (Employee employee : employeeList) {
            employee.accept(handler);
        }
    }
}
