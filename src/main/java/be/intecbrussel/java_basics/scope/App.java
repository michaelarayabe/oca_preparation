package be.intecbrussel.java_basics.scope;

/*
Variable Scope

It is a scope where the variable is visible.
Variable identifiers are statically scoped meaning the scope of a variable is determined at compile time not at run time. Meaning if there is any problem with the variable scope then you will know before your you run your program at compile time not after at runtime, this means you will not have a scope related problem at runtime.

Class Level Scopes

Class level variables are variables which are which are outside any methods but inside a class, we also call them fields. They are accessable from anywhere within a class. We also access these variable outside the class, if there is a suitable modifier in place.

There are three modifiers: private, public, protected and if no modifier is stated then the variable is considered packaged private (can be accesed within a package).

Note:

The only difference between protected and no modifier variable is: protected variable is visible from subclasses and no modifier classes are not! And both of them are visible from within a package.

Method Level Scopes

This are variables declared within a method. Their scope is from declaration till method returns. They are also called local variables. Method parameters are the same as local variables except, they are not declared within method's body, declared as a part of method signature and their scope is till method invocation.


Block Level Scopes

Are identified by a pair of curly brackets. Only be accessed within those brackets and inaccessable outside of it.


Main{

	Int num = 0;

	{
		num = 1;
	}

	Sout(num); //results 1 the num within the block level scope is also within method level scope so the num will be a reassignment of the first num = 0;
	And if we put int before the second num it becomes a compile time error. Since it was declared before.

}
* */
public class App {

    static int number1 = 0; //class level scope

    public static void main(String[] args) {

        {
            int number2 = 0; // block level scope
        }

        System.out.println(number1); //Accessible
        //System.out.println(number2); //Inaccessible
        //System.out.println(number3); //Inaccessible since we used it before it is declared!

        int number3 = 0; // method level scope
    }
}
