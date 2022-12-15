package designpattern.creationnal.feactory.v2;

public abstract class Coffee {
    public abstract String getName();

    public void addMilk(){
        System.out.println("加奶。。。");
    }


    public void addSugger(){
        System.out.println("加糖。。。");
    }

}
