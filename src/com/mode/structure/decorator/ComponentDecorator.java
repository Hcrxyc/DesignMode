package com.mode.structure.decorator;

/**
 * @Author admin
 * @Date 2022/3/9 16:53
 * @description 抽象装饰类
 */
public abstract class ComponentDecorator extends Component{

    private Component component;

    public ComponentDecorator(Component component){
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}
