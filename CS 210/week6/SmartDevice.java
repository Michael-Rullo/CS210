public abstract class SmartDevice{

    String name;
    Boolean status;

    public SmartDevice() {
        this.name = name;
        this.status = false;

    }

    public abstract void turnOn();

    public abstract void turnOff();

    public abstract void adjustSettings();

    public void displayStatus() {
        System.out.println(this.name + " is " + this.status);
    }
}