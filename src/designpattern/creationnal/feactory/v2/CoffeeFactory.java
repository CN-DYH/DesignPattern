package designpattern.creationnal.feactory.v2;

public class CoffeeFactory {
    public static Coffee createCoffee(String type){
        Coffee coffee = null;
        if("american".equals(type)){
            coffee = new AmericanCoffee();
        }else if("late".equals(type)){
            coffee = new LatteCoffee();
        }
        return coffee;
    }
}
