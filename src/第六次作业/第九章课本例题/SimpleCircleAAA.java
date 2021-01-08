package 第六次作业.第九章课本例题;
//程序清单9-2
public class SimpleCircleAAA {
    public static void main(String[] args) {
        SimpleCircleAAA circle1 = new SimpleCircleAAA();
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());

        SimpleCircleAAA circle2 = new SimpleCircleAAA(25);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

        SimpleCircleAAA circle3 = new SimpleCircleAAA(125);
        System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());

        circle2.radius = 100;
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());



    }
    double radius;

    SimpleCircleAAA(){
        radius = 1;
    }
    SimpleCircleAAA(double newRadius){
        radius = newRadius;
    }
    double getArea(){
        return radius * radius * Math.PI;
    }
    double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    void setRadius(double newRadius){
        radius = newRadius;
    }
}
