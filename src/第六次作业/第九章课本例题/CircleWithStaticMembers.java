package 第六次作业.第九章课本例题;
//程序清单9-6
public class CircleWithStaticMembers {
    double radius;
    static int numberOfObjects = 0;
    CircleWithStaticMembers(){
        radius = 1;
        numberOfObjects++;
    }
    CircleWithStaticMembers(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }

    static int getNumberOfObjects(){
        return numberOfObjects;
    }
    double getArea(){
        return radius * radius * Math.PI;
    }
}
