// While loop
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}

// The while loop and do while loop are similar except the do-while loop will execute at least once
int i = 0;
do {
    System.out.println(i);
    i++;

} while (i < 5);

//For loop
for (int count = 1; count < 3; count++) {
    System.out.println(count);
}

// Syntax for creating an array with new:
Base_type[] Array_name = new Base_Type[length];
int numbers = new int[4];
//arrays are allocated to the heap after using new
// fixed length once created
// the array above will have 4 values and they are originally initialized to 0

//Accessing Arrays
//syntax:
Array_name[index]

double[] temp = new double[7];
double sixthTemp = temp[5];
temp[0] = 32;
temp[3] = 50;
//

//May be faster to initialize in a loop
int[] numbers = new int[100];
for (int i = 0; i < 100; i++) {
    if (i == 0) {
        numbers[i] = 1;
    } else {
        numbers[i] = numbers[i - 1] + 1;
    }
}

//Or easier to compile-time initialize
double[] reading = {3.3, 15.8, 9.7};
System.out.println(reading.length); // output 3

//For each loop
// A simpler, shorter way to iterate over arrays or collections like lists without managing the index
//Syntax:
for (type_variable: array_name) {
    //Code ot execute for each element
}

double[] x = {7, 6, 2, 5, 0, 99, 208, 66};
double sum = 0;
double average = 0;
for (double value : x) {
    sum += value;
}
if (x.length != 0) {
    average = sum / x.length;
}

//Linear search
//does not require list to be sorted, slow since it must go through every element
See Linear_Search.png

// Objects, Classes and Methods
public static double calculateFinalPrice(double price, double discount, double tax) {
    return price - discount + tax;
}

double finalPrice1 = calculateFinalPrice(100.0, 20.0, 5.0);
double finalPrice2 = calculateFinalPrice(200.0, 30.0, 10.0);

// A static method is a method that belongs to the class itself, rather than to an instance (object) of the class.
// Main is a static method that is invoked by the system
// most methods we see as public, 

// a class is like a blueprint
// Think of it as a car and what it CAN do, its capabilities
public class Automobile{
    public double fuel;
    public double speed;
    public String license;
    public void accelerate(double pedalPressure) {
        // code goes inside this method that accelerates
    }
    public void decelerate(double pedalPressure) {
        //code goes here to decel
    }
    // more methods etc
}

// Classes
// a java program consists of objects
    // objects of various class types interacting with one another
// program objects can represent many things
// a class is a blueprint
// each java class definition is unually ina  file by itself; with the file named after that class
// however a java program may consist of multiple classes

