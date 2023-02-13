package learning.vladdubceac.singleton;

public class TestSingleton {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();

        // set the data value
        singleton.setData(55);

        System.out.println("First reference: "+singleton);
        System.out.println("Singleton data value is: "+singleton.getData());

        // Get another reference to the Singleton
        // Is it the same object ?
        System.out.println("Second reference: "+singleton);
        System.out.println("Singleton data value is: "+singleton.getData());

        singleton=null;
        singleton=Singleton.getInstance();
        System.out.println();
    }
}
