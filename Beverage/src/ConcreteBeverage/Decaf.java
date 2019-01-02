package ConcreteBeverage;

import BasicBeverage.Beverage;

/* 这是一个具体的饮料类型，他继承基本饮料类型，
 * 以获得统一的description属性 & cost()方法 */
public class Decaf extends Beverage {

    public Decaf() {
        /* 构造器里，设定属于自己的description属性 */
        description = "Decaf";
    }

    /* 对外提供“低咖啡因型”的基本价钱 */
    @Override
    public double cost() {
        return 1.05;
    }

}
