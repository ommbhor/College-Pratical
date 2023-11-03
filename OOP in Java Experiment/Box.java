public class Box {
    public double length;
    public double breadth;
    public double height;

    public Box(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }
    public double getVolume() {
        return length * breadth * height;
    }

    public static void main(String[] args) {
        Box box1 = new Box(3,6,7);
        Box box2 = new Box(5,4,2);
        Box box3 = new Box(9,6,8);

        System.out.println("The volume of the first box is " + box1.getVolume());
        System.out.println("The volume of the second box is " + box2.getVolume());
        System.out.println("The volume of the third box is " + box3.getVolume());
    }
}