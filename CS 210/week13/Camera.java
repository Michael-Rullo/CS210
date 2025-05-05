public class Camera {

    private double resolution;

    public Camera(double userRes) {
        if (userRes < 1.0) {
            this.resolution = 1.0;
        } else {
            this.resolution = userRes;
        }
    }

    public double getRes() {
        return this.resolution;
    }

    public void setRes(double userRes) {
        if (userRes < 1.0) {
            this.resolution = 1.0;
        } else {
            this.resolution = userRes;
        }
    }
}