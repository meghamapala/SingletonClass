package mysingletn;

public class Singleton {
    private static Singleton singleton = null;

    private Singleton(){}

    public static  Singleton getInstance() {
        return new Singleton();
    }
    public void display(){
        System.out.println("I am singleton class");
    }
}
