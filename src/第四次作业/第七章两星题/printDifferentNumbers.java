package 第四次作业.第七章两星题;
//7.5 (打印不同的数）
import java.util.Scanner;

public class printDifferentNumbers {
    public static void main(String[] args) {
        int[] a=new int[11];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers:");
        int number = input.nextInt();
        int s=1;
        a[0]=number;
        for(int i=0;i<9;++i){
            int number1 = input.nextInt();
            int p=0;
            for(int j=0;j<s;++j){
                if(number1==a[j])
                    p=1;
            }
            if(p==0) {
                a[s] = number1;
                s += 1;
            }
        }
        System.out.println("The number of distinct number is "+s);
        System.out.print("The distinct numbers are: "+a[0]);
        for(int i=1;i<s;++i)
            System.out.print(" "+a[i]);
    }
}
