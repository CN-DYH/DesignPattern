package designpattern.creationnal.feactory.v2;

public class CoffeeStore {
    public Coffee orderCoffee(String type){
        Coffee coffee = CoffeeFactory.createCoffee(type);

        coffee.addMilk();
        coffee.addSugger();

        return coffee;
    }
}
