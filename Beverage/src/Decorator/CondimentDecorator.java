package Decorator;

import BasicBeverage.Beverage;

/* 调味品装饰者基本类，扩展了Beverage。
 * 它继承Beverage不是为了获得其方法，
 * 而是为了统一装饰者 & 被装饰者的超类，
 * 以达到“装饰者不改变被装饰者类型”的目的 */
public abstract class CondimentDecorator extends Beverage {

    /* 重新实现getDescription()方法，
     * 以便为每个装饰者增加自己的描述 */
    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
