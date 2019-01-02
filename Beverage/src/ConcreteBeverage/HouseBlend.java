package ConcreteBeverage;

import BasicBeverage.Beverage;

/* 这是一个具体的饮料类型，他继承基本饮料类型，
 * 以获得统一的description属性 & cost()方法 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        /* 构造器里，设定属于自己的description属性 */
        description = "HouseBlend";
    }

    /* 对外提供“家庭综合型”的基本价钱 */
    @Override
    public double cost() {
        return .89;
    }
}
