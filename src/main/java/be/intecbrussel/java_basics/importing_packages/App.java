package be.intecbrussel.java_basics.importing_packages;

/*
Importing other java packages to make them accessible in your code

Two ways to import a package into your code:

The cumbersome way is: to basically call the identifier name in your code:

Ex: main {

	Java.util.List<Integer> list = new Java.util.ArrayList<>();
}


The second and better way is to use import instead:

Ex: import java.util.List;
      import java.util.ArrayList;

Then in your main code you use just the name of the class:
		List<Integer> list = new ArrayList<>();


The import keyword must be the first statement in your code except the package statement:

	Pakage statement - first
	Import statement (if any) - second

We can use astrisk * to import multiple classes in the same package.

Java.lang is imported automatically since we almost always use the classes inside it.


 */
public class App {
}
