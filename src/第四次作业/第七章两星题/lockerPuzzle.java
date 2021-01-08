package 第四次作业.第七章两星题;
//7.23 (游戏：储物柜难題）
public class lockerPuzzle {
    public static void main(String[] args) {
        int[] a=new int[101];
        for (int i=1;i<=100;++i){
            for(int j=100;j>=i;--j){
                if (j%i==0)
                    a[j]=1-a[j];
            }
        }
        for (int i=1;i<=100;++i){
            if (a[i]==1)
                System.out.print(i+" ");
        }
    }
}
