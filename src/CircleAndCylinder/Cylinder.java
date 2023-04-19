package CircleAndCylinder;

class Cylinder extends Circle{
    private double height = 1.0;
    public Cylinder(double radius, String color) {
        super(radius, color);
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double volume(){
        return getArea() * height ;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                " Volume:" + volume();
    }
}
class test{
    public static void main(String[] args) {
        Circle circle = new Circle(4.6 , "Green");
        System.out.println(circle);

        Cylinder cylinder= new Cylinder(3.1, "blue", 2.2);
        System.out.println(cylinder);
    }
}
