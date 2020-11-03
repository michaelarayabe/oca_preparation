package be.intecbrussel.java_basics.static_and_non_static;

public class App2 {

    public static void main(String[] args) {
        App app = new App();
        app.x = 20;
        System.out.println(app.x);

        App app1 = new App();
        System.out.println(app1.x);
    }
}
