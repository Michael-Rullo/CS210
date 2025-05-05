// package Week2;
// public class Hello {
//     public static void main(String[] args) {
//         System.out.println("Hello, World");
//     }
// }

// A java class can contain any number of classes
// The class that is the starting point of execution will contain:
// public static void main(String[] args)

// public class week2notes {
//     public static void main(String[] args) {
//         int numberOfBaskets, eggsPerBasket, totalEggs;
//         eggsPerBasket = 10;
//         numberOfBaskets = 6;

//         totalEggs = eggsPerBasket * numberOfBaskets;

//         System.out.println("If you have");
//         System.out.println(eggsPerBasket + " eggs per basket, and");
//         System.out.println(numberOfBaskets + " baskets, then");
//         System.out.println("the total number of eggs is " + totalEggs);
//     }
// }


// A variablle that has been declared, but not assigned a value is said to be uninitialized
// uninitialized class variables have the value null
// uninitialized primitive variables may have a default value

// A primitive data type is used for simple, non-decomposable values such as an individual number or charcter
// examples include int, double, char, 

// A reference/class data type is used to refer to objects and arrays and has both data and methods
// examples include string, scanner

// Four integer types:
// byte, short, int, long

// 2 floating point types:
// double, float

// 1 character type:
// char

// 1 boolean type:
// bool

// A value of one specific type can be assigned to a variable of that same type as long as it takes more memory than previously
// example: byte > short > int > long

// Strings have indices starting at 0 and are immutable

// String methods:
// string1 + string2                        "string1string2"
// string1.length("Hello")                  4
// "Hello".charAt(4)                        o
// "Hello".equals("hELLO")                  false
// "Hello".equalsIgnoreCase("hELLO")        true
// "Hello".indexOf("l")                     2
// "Hello".lastIndexOf("l")                 3
// "Hye".replace("H", "B")                  "Bye"
// "Hello".toUpperCase                      "HELLO"
// "Hello">toLowerCase                      "hello"

//Escape Characters
// \"                                       Double Quote
// \'                                       Single quote
// \\                                       Backslash
// \n                                       New line
// \t                                       Tab

//Comments
//Single line comment with //
/*
 * Multi Line comments as shown
 *
 * and again
 */

//Conditional Statements
// if (condition)
// else
//    (condition)
//
// ternary operators (shorter if-else)
// syntax: condition ? valueIfTrue : valueIfFalse;
// int a = 10;
// int b = 20;
// int max = (a > b ) ? a : b;
// System.out.println(max)                  '20'
//
// switch statement
// performs different operations based on the input (switches cases/operations)
// use break statements after each case so that other cases/operations are not considered
// public class test {
//     public static void main(String{} args) {
//         String num = 'ten';
//             switch (num) {
//                 case 'five':
//                     System.out.println('True');
//                     break;
//                 case 'three':
//                     System.out.println('True');
//                     break;
//                 default:
//                     System.out.println('False');
//             }
//         }
//     }
// Operators
// i == 1                                  Do not use to compare strings, use .equals()
// i != 1
// i > 1
// i < 1
// i >= 1
// i <= 1

// Compound statements
// combined using && as and
// if ((score > 0) && (score <= 100))
// combined using || as or
// if ((quantity > 5) || (cost < 10))
// bools can be negated using ! (exclamation)
// if (!isTrue)                             False


// if (condition)
// else if (blah)
// else if (blah)
// else

// System.exit(0)                           to exit a program