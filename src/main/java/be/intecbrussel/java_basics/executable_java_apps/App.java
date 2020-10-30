package be.intecbrussel.java_basics.executable_java_apps;
/*
Creating executable java applications with the main method:

For a class to be executable it must have a main method, and it must be public, it can be written this way:

Public static void main(String[] args){} but we can also write it this way:
Public static void main(String … args){} the args variable name can be something else, it is 'args' by convension.


To write a simple program using for instance notepad or sublime, we do the following:

We create a file ToUpperCaseConversion.java
Then we write the following:
Public class ToUpperCaseConversion{
	Public static void main(String … args){
		For(String arg : args){
			System.out.print(arg.toUpperCase() + " " )
		}
	}


}

Now to compile this code, save this code then go to the folder of this program using terminal then 'javac ToUpperCaseConversion.java' if there is no error, it will create a ToUpperCaseConversion.class file, then we use 'java ToUpperCaseConversion this is a test' this will out put THIS IS A TEST

Javac compiler consumes a source code and produces a byte code!

In the main method 'main' must be in small letters (identifiers in java are case sensitive)

If a file name and a class name are not the same compilation error happens

 */
public class App {
    /* First method
    public static void main(String[] args) {

    }

     */
    /* Second method
    public static void main(String ... args){

    }

     */ //args is only convention
    public static void main(String[] someName){

    }


}
