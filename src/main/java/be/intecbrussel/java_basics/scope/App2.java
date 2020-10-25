package be.intecbrussel.java_basics.scope;

public class App2 {

    //static int num = 0;

    public static void main(String[] args) {
         int num = 1; //1
        {
            num = num + 1; //2
        }

        System.out.println(num);

    }
}
