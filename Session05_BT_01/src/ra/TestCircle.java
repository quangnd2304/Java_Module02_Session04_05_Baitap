package ra;

import entity.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Ban kinh hinh tron: "+c1.getRadius());
        System.out.println("Dien tinh hinh tron: "+c1.getArea());
    }
}
