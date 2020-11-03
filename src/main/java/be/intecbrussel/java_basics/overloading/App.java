package be.intecbrussel.java_basics.overloading;
/*
Overloading resolution.

If there are a few methods with the same name and there is a method invocation, java will resolve using the following methods:

	- The one with a specific parameter is chosen. (and varargs and boxing will be ignored)

The next process has three phases:

Phase 1:  without boxing or unboxing and without varargs
Phase 2: allowing boxing and unboxing and without varargs
Phase 3: also by alowing varargs


The return type doesn't constitute a signature of method. So

Void sum(int a, int b) and int sum(int a, int b) are the same interms of method signature.

Casting has more priority than autoboxing in overloading resolution:

 */
public class App {

    public static void main(String[] args) {
        sum(0);
    }

    public static void sum(Integer x){
        System.out.println("I am invoked due to autoboxing!");
        System.out.println("result is:" + x);
    }

    public static void sum(long x){
        System.out.println("I am invoked due to casting!");
        System.out.println("result is: " + x);
    }
}
