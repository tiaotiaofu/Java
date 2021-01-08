package 第四次作业.第七章两星题;
//7.34 (对字符串中的字符排序）
import java.util.Scanner;

public class stringSort {
    public static void main(String[] args) {
        String a = new String();
        char[] list = new char[1000];
        Scanner input = new Scanner(System.in);
        a = input.next();
        for (int i=0;i<a.length();++i)
            list[i]=a.charAt(i);
        java.util.Arrays.sort(list);
        System.out.println(list);
    }
}
