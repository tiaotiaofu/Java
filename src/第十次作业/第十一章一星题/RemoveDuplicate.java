package 第十次作业.第十一章一星题;
// 11.13 (去掉重复元素）
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> s = new ArrayList<>();
        System.out.print("Enter ten integers: ");
        Scanner input = new Scanner(System.in);
        for (int i=0;i<10;++i)
            s.add(input.nextInt());

        System.out.print("The distinct integers are");
        removeDuplicate(s);
    }
    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i=0;i<10;i++){
            if (!a.contains(list.get(i)))
                a.add(list.get(i));
        }
        for (int i=0;i<a.size();i++)
            System.out.print(" "+a.get(i));
    }
}
