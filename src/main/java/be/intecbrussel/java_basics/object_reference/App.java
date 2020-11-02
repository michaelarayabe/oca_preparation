package be.intecbrussel.java_basics.object_reference;
/*
Object reference variables and primitive variables

Object reference variables store the address of the objects they refer to,
Primitive variables store the actual values.

During comparison: Object reference variables are compared based on their addresses of their objects and primitive variables are compared based on their literal values.

Note: Primitive types are compared based on their values and Reference types are compared based on their address so even if they have the same value two objects will not be equal.

EX: int i = 0 and int x = 0, x == i is true; however
SomeClassType c = new SomeClassType();
SomeClassType d = new SomeClassType();

Imagine: c.value = 0 and d.value = 0; c == d will return to false, since they are pointing to different address.

During assignment primitive type parameters  are independent of their argument, but reference types are dependent of a value change to the referenced object. (this is a vague statement, let's clarify it with an example)

EX:  int x = 1; int y = int x; if int x = 0, the vaue of int y = 1 and int x = 0; the second change of int x, will not affect int y.
But
SomeClassType c = new SomeClassType();
SomeClassType d = c;

C.value = d.value; they are dependent on each other


The answer will be 1 and 0;

Reference variables can still live after a method returns if they are been reassigned! But Primitive variables die after a method returns.



 */
public class App {
    public static void main(String[] args) {

    }
}
