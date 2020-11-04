package be.intecbrussel.java_basics.exceptions;
/*
Checked exceptions

Are exceptions that our programs recover from. They are enclosed by either: try catch or a method that provide throws clause.

All exceptions are checked exceptions except: runtimeException and their subclasses and error.


Unchecked exceptions
Are the ones our program does not recover from. They are internal. Logical error, bugs, incorrect usage of api … They are indicated by RuntimeException and its subclasses.

Errors

Are also the one our program can not recover from, but they are external to the applicaton. Ex: StackOverflowErroe, OutOfMemoryError

Advantages of Exception Handeling

	- Separating error-handling code from regular code
	- Propagating errors up the call stack
	- Grouping and differentiating error types


Note: All exceptions thrown in a program are objects.



 */
public class App {

    public static void main(String[] args) {

    }
}
