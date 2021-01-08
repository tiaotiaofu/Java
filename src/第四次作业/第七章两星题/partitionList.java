package 第四次作业.第七章两星题;
//7.32 ( 划分列表）
import java.util.Scanner;

public class partitionList {
    public static void main(String[] args) {
        int[] list = new int[1000];
        int[] list1 = new int[1000];
        int[] list2 = new int[1000];
        int number,j=0,t=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list:");
        number = input.nextInt();
        for (int i=0;i<number;++i)
            list[i] = input.nextInt();
        for (int i=1;i<number;++i){
            if (list[i]<=list[0]){
                list1[j]=list[i];
                j+=1;
            }

            else {
                list2[t]=list[i];
                t+=1;
            }

        }
        System.out.print("After the partition, the list is");
        for (int i=0;i<j;++i)
            System.out.print(" "+list1[i]);
        System.out.print(" "+list[0]);
        for (int i=0;i<t;++i)
            System.out.print(" "+ list2[i]);
    }
}
