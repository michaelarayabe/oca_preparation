package be.intecbrussel.java_basics.equals;
/*
In String == compares objects by reference.

 */
public class App {

    public static void main(String[] args) {
        String x = "hello";
        String y = new String("hello");
        //System.out.println(x.equals(y));

        Data data1 = new Data(0);
        Data data2 = new Data(0);

        System.out.println(data1.equals(data2));

    }


}
