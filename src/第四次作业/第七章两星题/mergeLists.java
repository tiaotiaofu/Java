package 第四次作业.第七章两星题;
//7.31 (合并两个有序列表）
import java.util.Scanner;

public class mergeLists {
    public static void main(String[] args) {
        int[] list1 =new int[100];
        int[] list2 =new int[100];
        int[] list3 = new int[200];
        int number1, number2,j;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1:");
        number1 = input.nextInt();
        for (int i=0;i<number1;i++)
            list1[i] = input.nextInt();
        System.out.print("Enter list2:");
        number2 = input.nextInt();
        for (int i=0;i<number2;++i)
            list2[i] = input.nextInt();
        int a1=0;
        int a2=0;
        for (j=0;j<(number1+number2);++j){
            if (a1==number1){
                list3[j] = list2[a2];
                a2+=1;
            }
            else if (a2==number2){
                list3[j] = list1[a1];
                a1+=1;
            }
            else if (list1[a1]>list2[a2]){
                list3[j] = list2[a2];
                a2+=1;
            }
            else {
                list3[j] = list1[a1];
                a1+=1;
            }
        }
        System.out.print("The merged list is");
        for (int i=0;i< (number1+number2);++i)
            System.out.print(" " + list3[i]);
    }
}
