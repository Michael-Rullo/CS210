public class ShippingContainer <type> {
    
    private int weight;
    private type content;

    public ShippingContainer(type userObject, int userWeight) {
        this.content = userObject;
        this.weight = userWeight;
    }

    public type getContent() {
        return this.content;
    }

    public void setContent(type userObject) {
        this.content = userObject;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int userWeight) {
        this.weight = userWeight;
    }
}