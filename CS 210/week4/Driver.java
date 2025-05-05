package Week4;

public class Driver {
    
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        
        System.out.println("Add info for person 1 below");
        person1.addInfo();
        System.out.println();
        System.out.println("Add info for person 2 below");
        person2.addInfo();
        System.out.println();

        System.out.println("person1 info");
        person1.displayInfo();
        System.out.println("person2 info");
        person2.displayInfo();
        System.out.println();

        person1.greetOthers();
        System.out.println();
        person2.greetOthers();
    }
}
