public class SmartThermostat extends SmartDevice {

    int temperature = 69;

    @Override
    public void turnOn() {
        if (status) {
            System.out.println(name + " is already ON");
        } else {
            status = true;
            System.out.println(name + " is now ON");
        }
    }

    @Override
    public void turnOff() {
        if (status) {
            status = false;
            System.out.println(name + " is now OFF");
        } else {
            System.out.println(name + " is already OFF");
        }
    }

    @Override
    public void adjustSettings(int temp;) {
        temperature = temp;
        System.out.println("Temperature adjusted to " + temperature + " degrees");
    }
}