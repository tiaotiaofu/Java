package 第十三次作业.异常;
// 12.7
import java.util.Scanner;

public class bin2Dec {
    public static int binTODec(String hex){
        int decimalValue = 0;
        for (int i=0;i<hex.length();i++){
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue*2 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }
    public static int hexCharToDecimal(char ch){
        if (ch>='0' &&ch<='1')
            return ch-'0';
        else
            throw new NumberFormatException("NumberFormatException");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a bin number: ");
        String hex = input.next();
        try {
            int x = binTODec(hex);
            System.out.println(x);
        }
        catch (NumberFormatException ex){
            System.out.println("请输入二进制数");
        }
    }
}
