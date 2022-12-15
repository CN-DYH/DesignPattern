package designpattern.creationnal.feactory.v1;

public class CoffeeStore {
    public Coffee orderCoffee(String type){
        Coffee coffee = null;
        if("american".equals(type)){
            coffee = new AmericanCoffee();
        }else if("late".equals(type)){
            coffee = new LatteCoffee();
        }

        coffee.addMilk();
        coffee.addSugger();

        return coffee;
    }
}
