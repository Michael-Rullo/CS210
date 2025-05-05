public class Driver {
    
    public static void main(String[] args) {
        
        Drone drone0 = new Drone(10);
        Camera camera0 = new Camera(5);

        ShippingContainer <Drone> shippingContainer0 = new ShippingContainer<Drone>(drone0, 15);
        ShippingContainer <Camera> shippingContainer1 = new ShippingContainer<Camera>(camera0, 5);

        System.out.println("Drone container weight: " + shippingContainer0.getWeight());
        System.out.println("Drone max height: " + shippingContainer0.getContent().getHeight());

        System.out.println("Camera container weight: " + shippingContainer1.getWeight());
        System.out.println("Camera resolution: " + shippingContainer1.getContent().getRes());
    }
}
