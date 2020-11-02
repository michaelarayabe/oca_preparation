package be.intecbrussel.java_basics.equals;
/*
In String == compares objects by reference.
If we want to compare two objects (instances) excluding Strings the ‘equals' method returns false eventhough their value is the same, for it to be true we need to override 'equals' in the class. But when it comes to String, equals method only compare the literal value it holds and the == compares the reference value.

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
