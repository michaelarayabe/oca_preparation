package be.intecbrussel.java_basics.static_and_non_static;



/*
 We can access a non static method within main by creating a new instance of a  class(obviously)
 When we have a static variable within a class, its value is shared with any other objects created. This is not the case
 in instance variables. An instance variable set for a certain object will not but accessible for another new object.

 */
public class App {

    int x;

    public static void main(String[] args) {
       //new App().someMethod();

        System.out.println();
    }

    public void someMethod(){
        x++;
    }
}
