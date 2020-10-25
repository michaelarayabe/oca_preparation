package be.intecbrussel.java_basics.class_structure;
/*

Class Structure

Class declaration

Includes
	• Modifiers like private or public (niet verplicht),
	• the class keyword(verplicht),
	• the class name (by convention first letter is capitalized)(verplicht),
	• name of the class's parent (superclass) if any, preceded by the keyword extends (niet verplicht),
	• List of interfaces separated by comma, if any  (niet verplicht),
	• The class body surrounded by class brackets {} (verplicht)


Class body contains:

	• Fields,
	• Contructors,
	• Methods


Ex: public class ClassName extends MyClass implements MyInteface{
	//Fields,
	//Contructors,
	//Methods
	}

Note: a class in java can not extend more than one class.

Field declarations

	• Can have zero or more modifiers,
	• Must have the type of the field,
	• Must have the name of the field.

Note: a field and a method can share the same name. But we should avoid that to avoid ambiguity.

Method declarations

	• Modifiers,
	• Must have Return type (if it returns a value otherwise void)
	• Must have Method name,
	• Must have Empty or more parameters,
	• An exceptionlist
	• Must have Method body


Constructor declarations

Constructors: used to create objects from the class.

Note: a default constructure has the same accessablity as the class.

Constructor declaration is the same as method declaration except, they don't have return type, must have the name of the class

	• Modifiers,
	• Must have Constructor Name(== class name),
	• An exception list
	• Must have Zero or more parameters
	• Must have Constructor body

 */
public class App {

    public static void main(String[] args) {

    }

}
