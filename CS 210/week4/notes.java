package Week4;

import java.lang.classfile.instruction.ThrowInstruction;
import javax.swing.plaf.basic.BasicSplitPaneUI;

public class notes {
    // Accesing instance variables outside of the class:
    object_name.instance_variable_name

    //referring to instance method outside of the class:
    object_name.instance_method_name()

    // these will only work when the instance variable/ method is public



    // referring to instance variables inside the class:
    instance_variable_name
    instance_method_name();
    // can use the keyword "this" to refer to it


    inside the class the unamed object can be referred to with "this"
    System.out.println("What is the name of the species?");
    this.name = keyboard.nextLine();
    The keyword "this" stands for the current instance of the object

    When creating mltiple instanecs (objects) of a class, each object will have its own copy og instance variables
    this means that each object has its own separate memory space for storing the values of instance variables

    public vs private modifiers:
    - a class, method or instance variable defined as public means:
        - any other class can directly use or access the class, method or instance variable by name
    - classes are generally specified as public
    - instance variables should not be public

    accessor and mutator methods:
    when instance variables are provate you must provide methods to access values stored there
        - these are referred to as an accessor or a get methods
    must also provide methods to change the valuyes of the priovate instance variables
        - referred to as a mutator or set method


    Encapsulation:
    a fundamental OOP concept, practice of restricting certain details and only allowing it to be modified or viewed through a certain interface
    Ex) car
        - we use and see the brake, wheel and pedals
        - however we only interface with those and do not see the mechanical details
    
    a class interface:
        - tells whats the class does
        - gives headings for public methods and comments about them
    a class implementation:
        - contains private variables
        - includes definitions and bodies of public and private Methods 
    A well encapsulatec class:
    - variables and indentifiers name well
    - private instance vars
    - public get/set methods
    - make helper methods private if they are only useful in the class
    - all classes, methods, instance variables, class variables, and significant portions of code are commented on
    - has a precondition statement:
        - states the conditions that must be true before the method is invoked
    - has a postcondition statement:
        - tells what will be true after method execution
    


    primitive type vs class type variables:

    - all variables are implemented as a memory location
    - primitive types (e.x: int, float, bool):
        - stack: the value of the primitive type is stored directly in the memory location assigned to the variable
    - class types (e.x: objects of a class):
        - Stack: the reference (memory address in the stack as the memory location of the variable num)
        - Heap: The actual object is stored in the heap, and the reference in the variable points to this location
    
    Variables of a class type:
    - object itself is not stored in the variable
        - it is stroed elsewhere in memory
        - variable contains address of where it is stored
    - address of this other memory location is called a reference to the object
    Parameters of a class type:
    - a methods parameters of a class type are treated differently than its parameters of a primitive type
    - when assignment operator is used with objects of class type
        - only memory address is copied
    - similar to use of parameter of class type
        - copy of memory address of argument passed to input parameter
        - input parameter may access public variables and methods in that class
        - object arguments can be changed by class methods
    
    Constructors:

    - A special method that is used to initialze objects
        - at least one constructor is called when an object of a class is created using new() keyword
        - at the time of calling the constructor, memory for the object is allocated in the memory
        - it can be used to initialize the state of an object at the time of creation (set values of object attributes)
    
    - A constructor can have parameters
    - can have multiple definitions
    - must have the same name as the class
    - a constructor can not be abstract, final, static
    - do not have return types
        - this is not the same as a return type of void
    
    - types of constructors:
        - default
            - no parameters
            - invisible/implicit constructor (automatically provided by java compiler when no other constructors are defined)
            - performs no special actions
        - zero parameters
            - simply a programmer explicity defined constructor which takes no arguments
            - allows you to initialize an object with specific default values when an object is created, even if no paramters are passed
        - parameterized
            - allows you to specify values when creating an object
        - copy
            - creates a new object as a copy of an existing object of the same class
    
    - calling methods from constructors:
        - the constructor is called once when an object is created
        - setters, allow you to modify an objects state after its been created
        - since constructors have the same names, to call another constructor inside of our current constructor:
            - call the constructor using the input parameters that match it
    
    - using defined constructors:
        - constructor can be used when creating a new object of the class
        - java will automatcially find a matching constructor from the user defined constructors that matches the passed parameters
        
    


    Null value:
    - if a refreence type variable (String, array, objects)
      is declared but no initialized, then java will automatically
      assign it with the value Null
    - you cannoy access an objects data or ethods when the object is Null
    - Since nulls are memory addresses, you can use == and != to check for null objects
}
