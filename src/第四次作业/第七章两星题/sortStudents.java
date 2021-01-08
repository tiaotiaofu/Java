package 第四次作业.第七章两星题;

import java.util.Scanner;

//7.17 (对学生排序）
public class sortStudents {
    public static void main(String[] args) {
        int[] mark = new int[100];
        String[] name = new String[100];
        Scanner input = new Scanner(System.in);
        System.out.print("输入学生个数:");
        int number =input.nextInt();
        System.out.print("输入学生的姓名和他们的成绩:");
        for(int i=0;i<number;++i){
            name[i]=input.next();
            mark[i]= input.nextInt();
        }
        for(int i=0;i<number-1;++i){
            int markMax = mark[i];
            int maxIndex = i;
            for (int j=i+1;j<number;j++){
                if (markMax<mark[j]){
                    markMax=mark[j];
                    maxIndex = j;
                }
            }
            if (maxIndex!=i){
                int t;
                String s;
                t=mark[i];
                mark[i]=mark[maxIndex];
                mark[maxIndex]=t;
                s=name[i];
                name[i]=name[maxIndex];
                name[maxIndex]=s;
            }
        }
        for(int i=0;i<number;++i){
            System.out.println(name[i] +" "+ mark[i]);
        }

    }
}
