package be.intecbrussel.java_basics.object_reference_and_primitive;

//passing primitive type into our method and object reference
public class App {
    public static void main(String[] args) {

        App2 app2 = new App2(6);
        System.out.println(app2.value);

        sum(app2);
        System.out.println(app2.value);

    }

    public static void sum(App2 app2){
        app2.value = app2.value + 10; // This method will affect our argument because our parameter calls value,
        //if it didn't and only manipulated app2 object, then it wont have any effect for our argument
        //during invocation. Since we were just playing around a local variable.
    }
}

class App2{
    int value;
    public App2(int value){
        this.value = value;
    }
}
