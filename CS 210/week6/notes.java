
import java.io.ObjectStreamException;
import java.lang.reflect.Method;

public class notes {
    // Inheritance:
        // an important pillar of OOP
        // it is the mechanism in which one class is allowed to inherit the features (fields and methods) of another class
        // inheritance in java is a way to create a new class based on an existing class without the manual copy-paste of the source code
    
    // Inheritance Terminology:
    //     Super Class/Parent Class/Base Class:
    //         The class whose features are inherited
    //     Sub Class/Child Class/Derived Class/Extended Class:
    //         The class that inherits the other class
    //         a class that inherits from another class can reuse methods and fields but also add additional methods and fields

    // What is inherited?:
    //     The child class inherits almost everything
    //         instance variables and methods, regardless of their declared visibility, from the parent class
    //     These inherited members are accessible within the child class, depending on their visibility in the parent class
    //     Even private instance variables are inherited. However, they cannot be directly accessed outside of the class when they are declared
    //         Child class can still interact with them through public or protected methods provided by the parent class
    
    // Constructors in derived classes:
    //     Constructors are not inherited in the usual sense:
    //         A parent constructor does not become a constructor in the child class
    //         However, child constructors can invoke the code in a parent constructor via the "super" keyword
    //             It has to be the first line of code in the child constructor
    //         If a child class does not directly invoke the parent constructor, then Java will automatically call super() (the parents default constructor) to the first line of the child constructor during compile-time
    //             In this case the parent constructor must provide a default constructor - if any other constructor was created
    //             It is recommended to explicitly call a parent constructor, even if its just super()
    // When a parent constructor is called, no objectof the parent class is made. It is just a way to tell Java to execute the code that is in the parent constructor
    //     to let each class init their own variables - the child class doesnt have to duplicate the work that is written in the parent
    // Its convenient to think of it as being pasted into the child class (renamed to super) along with other inherited members

    // The object class:
    //     The java.lang.object class is a superclass for all the other classes 
    //         Every class inherits the method toString and equals from Object
    //         all classes that you create automatically inherit those methods
    //             howver they will not work correctly for almost any class that you define
    //             thus, you need to override the inherited method definitions wiht new, more appropriate definitions
    //     all classes implicitly extends Objects
    //     object is at the top of all inheritance hierarchies in java
    //     even classes that you defineyourself without using inheritance are descendant classes of the class object

    // Method Overrides:
    //     the class Employee in our case defines a method named toString() thta has no parameters
    //     the class Person also has a method by the same name that has no parameters
    //     if the class Employee would inherit the method toString() from the class Person, then the class Employee would have to methods of the same name 
    //     Java has a rule to avoid this problem
    //     If the child class defines a method with the same name, the same number and type of parameters, the definition in the child class is said to override the definition in the parent class
    //     the new definition replaces the old definition of the method when objects of the derived class recieves a call to the method
    //     AS A RULE: if an object of a class calls an overriden method; the version that will be picked is always the closest to the object

    // Overriding vs Overloading:
    //     Do not confuse overriding a method with overloading a method
    //     When you override a method definition, the new method definition given in the child class has: 
    //         the same name
    //         the same type
    //         the exact same number and type of parameters
    //     When you overload a method, the new method definition in the class has:
    //         The same name, but a different number of paramters. Or a parameter of a different type from the other method in the parent class/ or within the same class
    //             The return type does not matter
    //             In such cases the class would have both methods

    // Method Overriding Continued
    //     In our case the Employee (child) class inherited toString() method from its parent (Person class)
    //     However the implementation of that method needed to be different in the child class
    //     we accomplished this using method overriding

    //     Java annotations are used to provide extra information to the compiler
    //     In our case, the @ Override is an optional that lets the compiler know your intent is to override
    //     Try the following:
    //         Omit the @Override
    //         Omit and misspell toString()
    //         Do not omit and misspell toString()
    //     Notice the error that occurs in the third situation that did not occur in the second.
    //         This is the primary purpose of the annotation.
    //         Although optional, it allowed you to tell the compiler that your intent is to override.
    //         If the compiler sees the @Override annotation, then it checks to make sure it's an override and will let you know if you made a mistake.

    

}