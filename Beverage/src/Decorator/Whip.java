package Decorator;

import BasicBeverage.Beverage;

/* "奶泡"是一个装饰者，通过继承CondimentDecorator而进一步
 * 扩展基类Beverage（对具体继承基类的饮料进行装饰，同时不改变其基本类型）
 * OO设计原则5——类应该对扩展开放，对修改关闭 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        /* 装饰者构造器中，输入被装饰者beverage */
        this.beverage = beverage;
    }

    /* 通过getDescription()方法，
     * 在被装饰者的描述基础上，增加装饰者的描述 */
    @Override
    public String getDescription() {
        return beverage.getDescription()
                + ", Whip";
    }

    /* 在被装饰者价钱的基础上，增加装饰者的价钱，
     * 进而得到当前的总售价 */
    @Override
    public double cost() {
        return beverage.cost()
                + .10;
    }
}
