package 第三章两星题;
//3.19 (计算三角形的周长）
import java.util.Scanner;

public class calculateThePerimeterOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d=a+b+c;
        if(a+b>c && a+c>b && b+c>a)
            System.out.println("三角形的周长： "+ d );
        else
            System.out.println("这些输入值不合法");
    }
}
