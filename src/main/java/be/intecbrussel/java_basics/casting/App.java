package be.intecbrussel.java_basics.casting;
/*
* Working with Java data types

Class level variables

They are declared and initialized at the same time, if you declared it and not initialized it then they will be set to a default initialization based on their data types.
Ex: This are the default values:

Byte, short, int, long : 0;
Float, double : 0.0;
Char : '\u0000';
Objects : null;
Boolean: false;


Local variables

They must be declared and explicity initialized before being used (In the case of class level variables they shouldn't necessairly explicity initilized, if not they will be set automatically to their default value implicitly).

The local varialbe can be initilized anywhere within its scope, after it is declared.


Primitive Data Type Casting

Two types of casting: widening and narrowing

Widening casting : implicitly implemented

Byte-> Short->Int -> long -> float -> double
Ex:

Narrowing casting: explicitly implemented (meaning needs cast operator)

Double -> Float -> Long -> Int -> Short -> Byte

Char is a special primitive data type

Char has the same length as Short, but casting from char to short and from short to char are both narrowing.

Widening casting for char: char -> int, long, float or double
Narrowing casting for char: char -> short, byte and from short, int, long, double, float -> char
Widening and narrowing : byte to char

The magnitude and precision of a value may be lost after being cast. Those are only guaranteed in widening casting between integral numeric types.

Note: the casting of primitive types never results any runtime exceptions. In casting we look at our statements from RIGHT to LEFT.

For ex:

Long myLong = int MyInt; // this is widening

* */
public class App {

    static int classVar;

    public static void main(String[] args) {

        int myInt = (int)0.0; // narrowing, meaning we must use (casting type)

        byte myByte = (byte) myInt; //narrowing

        int localVar = 0;
        //long newVar = localVar;
        System.out.println(localVar);
    }
}
