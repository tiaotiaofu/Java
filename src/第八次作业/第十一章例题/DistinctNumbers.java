package 第八次作业.第十一章例题;
// 程序清单 11-9
import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers (input ends with 0): ");
        int value;

        do {
            value = input.nextInt();

            if (!list.contains(value) && value!=0)
                list.add(value);
        }while (value!=0);

        for (int i = 0; i<list.size(); i++)
            System.out.print(list.get(i) + " ");
    }
}
