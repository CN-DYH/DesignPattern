package designpattern.creationnal.singleton;


public class Singletonlazy {
    private Singletonlazy(){
    }

    private static Singletonlazy singletonlazy;


    public static synchronized Singletonlazy getInstance(){

        if(singletonlazy == null){
            singletonlazy = new Singletonlazy();
        }
        return singletonlazy;
    }
}
