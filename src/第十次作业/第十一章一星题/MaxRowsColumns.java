package 第十次作业.第十一章一星题;
// 11.9 (最大的行和列）
import java.util.Scanner;
public class MaxRowsColumns {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size n:");
        n = input.nextInt();
        System.out.println("The random array is");
        int[][] a = new int[n][n];
        for (int i=0;i<n;i++)
            for (int j=0;j<n;j++)
                a[i][j] = (int) (Math.random()*2);
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        int p=0;
        int index=0;
        for (int i=0;i<n;i++){
            int s=0;
            for (int j=0;j<n;j++){
                if (a[i][j]==1)
                    s+=1;
            }
            if (s>p){
                p=s;
                index=i;
            }
        }
        System.out.println("The largest row index: "+index+", "+p);
        index=0;
        p=0;
        for (int i=0;i<n;i++){
            int s=0;
            for (int j=0;j<n;j++){
                if (a[j][i]==1)
                    s+=1;
            }
            if (s>p){
                p=s;
                index=i;
            }
        }
        System.out.println("The largest column index: "+index+", "+p);
    }
}
