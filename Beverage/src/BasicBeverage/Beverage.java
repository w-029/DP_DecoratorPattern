package BasicBeverage;

/* 所有饮料都必须继承的超类，
 * 它为具体的饮料 & 装饰者们统一接口，
 * 所以，这个抽象类也可以是接口类型 */
public abstract class Beverage {

    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public  abstract double cost();
}
