package week5;

public class notes {
    
    Overloading Basics:

    - overloaded methods are two or more methods that have the same name within the same class
    - java distinguishes the methods by method signature
        - method signature is a combination of method name & number and types of parameters (including order of parameters)
        - Return type not part of method signature when distinguishing overloaded methods
        - If it cannot match a call with a definition, then it will attemempt a type conversion
    
    - Overloading can be applied to any kind of method

    - Type conversion:
        - if an exact match isnt found, Java attempts automatic type conversion of arguments
            - e.x an int like 2 is converted to a double 2.0 when a method wants a double as an argument
    

    Static Variables and Static Methods:

    - static variables are also called class variables
    - belongs to tyhe class not to an individual object
    - a single copy shared by all instances of the class
    - should be initialized once at start of execution before any instance variables are created
    - can be accessed directly by class name without creating an object
    - could allow objects to communicate with one another or perform joint actions


    - static variables vs instance variables:
        - Instance:
            1) Belongs to an instance of a class
            2) each object of the class has its own copy of instance variables
            3) modifying an instance var in one object has no effect on the same var in another object
            4) used to store data that is specific to each object
            5) accessed using the object reference objectName.instanceVariable
        - Class (Static Variable):
            1) Belongs to the class itself
            2) shared amongst all instances of the class
            3) modifying it affects all instances
            4) used for data that should be shared across all instances of the class
            5) accessed using the class name ClassName.classVariable
    
    -static methods:
        - can only access static data directly
        - cannot refer to the keyword "this"
        - can only call other static methods directly
        - cannot call a non static method unless it has an object to do so
        - can be accessed directly by the class name and doesnt need any object
    
    - named constants:
        - java provides a mechanism to:
            - define a variable, Init it, and fix the value so it cannot be changed
            - Syntax: public static final Type variable = Constant;
            - ex:     public static final double PI = 3.14159;
            
}
