package entity;

public class Circle {
    //1. Thuoc tinh
    private double radius;
    private String color;
    //2. Ham tao

    public Circle() {
        this.radius = 2;
        this.color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color="red";
    }
    //3. Phuong thuc

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }
}
