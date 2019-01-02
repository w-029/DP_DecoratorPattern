import BasicBeverage.Beverage;
import ConcreteBeverage.DarkRoast;
import ConcreteBeverage.Espresso;
import Decorator.Mocha;
import Decorator.Soy;
import Decorator.Whip;

/* OO这是这模式——动态地将责任附加到对象上。
 * 想要扩展功能，装饰者提供有别于继承的另一种选择。 */
public class StarbuzzCoffee {
    public static void main(String arg[]) {

        /* 来一杯浓缩咖啡（不加调味品），打印其价钱 */
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
            + " $" + beverage.cost());

        /* 来一杯深焙咖啡（双份摩卡，外加奶泡），打印其价钱 */
        /* 因为所有装饰者 & 基本类型饮料都继承自同一个超类Beverage（统一了它们的类型）
         * 故：每次创建一个装饰者都会返回原类型对象，
         * 同时，对旧有对象进行了“再包装”，增加了装饰者的描述 & 价钱 */
        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription()
                + " $" + beverage1.cost());

        /* 来一杯家庭浓缩型咖啡（豆浆、摩卡，奶泡全要），打印其价钱 */
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());
    }
}
