package 第四次作业.第七章两星题;
//7.24 (仿真：优惠卷收集人问题）
public class couponCollector {
    public static void main(String[] args) {
        int[] a = new int[4];
        int i=0;
        String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        String[] suits= {"Spades", "Hearts", "Diamonds", "Clubs"};
        while (a[0]+a[1]+a[2]+a[3]!=4){
            int number1 = (int)(Math.random()*4);
            int number2 = (int)(Math.random()*13);
            if (a[number1]==0){
                System.out.println(ranks[number2] + " of " + suits[number1]);
                a[number1]=1;
            }
            i+=1;
        }
        System.out.println("Number of picks:" +i);
    }
}
