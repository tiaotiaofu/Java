package 第三章两星题;
//3.9 ( 商业：检查 ISBN-10 )
import java.util.Scanner;

public class checkISBN_10 {
    public static void main(String[] args) {
        System.out.print("Enter the first 9 digits of an ISBN as integer:");
        Scanner input = new Scanner(System.in);
        String number = input.next();
        int a= Integer.parseInt(number);
        int s=0;
        for(int i=9;i>=1;--i){
            s+= i* (a%10);
            a = (int)(a/10);
        }
        if (s%11==10) {
            System.out.println("The ISBN-10 number is "+number + "X");
        }
        else {
            s = s % 11;
            System.out.println("The ISBN-10 number is "+number + s);
        }
    }
}
