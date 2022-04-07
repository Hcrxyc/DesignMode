package com.mode.behavior.mediator;

/**
 * @Author admin
 * @Date 2022/3/15 14:43
 * @description
 */
public class ConcreteMediator extends Mediator{
    //维持对各个同事对象的引用
    public AddButton addButton;
    public UserList list;
    public TextBox textBox;

    //封装同事对象之间的交互
    @Override
    public void componentChanged(Component c) {
        //单击新增按钮
        if (c == addButton) {
            System.out.println("单击增加按钮新增用户");
            list.update();
            textBox.update();
        }
        //从列表框选择客户
        else if (c == list) {
            System.out.println("从列表框选择用户");
            textBox.update();
        }
        //选中文本框客户信息
        else if (c == textBox) {
            System.out.println("选中文本框用户信息");
        }
    }
}
