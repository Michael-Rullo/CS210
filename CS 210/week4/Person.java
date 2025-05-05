package Week4;

import java.util.Scanner;

public class Person {
    public String name;
    public double age;
    public String address;
    public String phoneNumber;

    public void addInfo() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your phone number below as a single number: ");
        phoneNumber = keyboard.nextLine();

        System.out.println("Enter your name below: ");
        name = keyboard.nextLine();

        System.out.println("Enter your age below: ");
        age = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println("Enter your address below: ");
        address = keyboard.nextLine();
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
    }

    public void greetOthers() {
        System.out.print("Hello, my name is " + name);
        System.out.println(", and I am " + age + " years old");
    }
}