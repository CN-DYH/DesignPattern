package designpattern.structural.daili.jingtai;

public class ProxyPoint implements SellTicket{

    Trastation trastation = new Trastation();

    @Override
    public void sell() {
        System.out.println("代售点收取手续费");
        trastation.sell();
    }
}
