package ConcreteBeverage;

import BasicBeverage.Beverage;

/* 这是一个具体的饮料类型，他继承基本饮料类型，
 * 以获得统一的description属性 & cost()方法 */
public class Espresso extends Beverage {

    public Espresso() {
        /* 构造器里，设定属于自己的description属性 */
        description = "Espresso";
    }

    /* 对外提供“浓缩型”的基本价钱 */
    @Override
    public double cost() {
        return 1.99;
    }
}
