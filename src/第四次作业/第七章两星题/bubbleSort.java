package 第四次作业.第七章两星题;
//7.18 (冒泡排序）
import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        double[] number = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.print("输入10个数字：");
        for(int i=0;i<10;++i)
            number[i]=input.nextDouble();
        for (int i=0;i<9;++i){
            for (int j=9;j>i;--j){
                if (number[j]<number[j-1]){
                    double t;
                    t=number[j];
                    number[j]=number[j-1];
                    number[j-1]=t;
                }
            }
        }
        for (int i=0;i<10;++i)
            System.out.println(number[i]+" ");
    }
}
