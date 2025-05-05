public class Drone {

    private double maxHeight;

    public Drone(double userHeight) {
        if (userHeight < 0.0) {
            this.maxHeight = 0.0;
        } else {
            this.maxHeight = userHeight;
        }
    }

    public double getHeight() {
        return this.maxHeight;
    }

    public void setHeight(double userHeight) {
        if (userHeight < 0.0) {
            this.maxHeight = 0.0;
        } else {
            this.maxHeight = userHeight;
        }    }
}