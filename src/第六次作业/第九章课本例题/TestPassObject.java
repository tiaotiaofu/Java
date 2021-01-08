package 第六次作业.第九章课本例题;
// 程序清单 9-10
public class TestPassObject {
    public static void main(String[] args) {
        CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(1);

        int n =5;
        printAreas(myCircle, 5);

        System.out.println("\n" + "Radius is " + myCircle.getRadius());
        System.out.println("n is " + n);
    }

    public static void printAreas(CircleWithPrivateDataFields c, int times){
        System.out.println("Radius \t\tArea");
        while (times >=1){
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            times--;
        }
    }
}
