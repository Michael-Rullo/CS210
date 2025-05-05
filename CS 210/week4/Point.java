class Point {
    int x;
    int y;
    public void setPoint(int x, int y) {
    this.x = x;
    this.y = y;
    }
    public void display() {
    System.out.println("Point(" + x + ", " + y + ")");
    }
    public void modifyObject(Point point) {
        point.x += 10;
        point.y += 10;
        System.out.println("Inside modifyObject:");
        point.display();
    }
    public static void main(String[] args) {
        Point point = new Point();
        point.setPoint(1,2);
        System.out.println("Before modifyObject:");
        point.display();
        point.modifyObject(point);
        System.out.println("After modifyObject:");
        point.display();
    }
}
    