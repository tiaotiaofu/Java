package 第四次作业.第七章两星题;
//7.3 (计算数字的出现次數）
import java.util.Scanner;

public class calculateNumbers {
    public static void main(String[] args) {
        int[] a = new int[101];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100: ");
        for(;;){
            int number=input.nextInt();
            if(number==0)
                break;
            else
                a[number]+=1;
        }
        for (int i=0;i<=100;++i){
            if (a[i]==1)
                System.out.println(i + " occurs " + a[i] + " time");
            else if(a[i]>1)
                System.out.println(i + " occurs " + a[i] + " times");
        }
    }
}
