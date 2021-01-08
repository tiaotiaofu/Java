package 第十三次作业.异常;
// 12.6
import java.util.Scanner;

public class NumberFormatExceptionError {
    public static int hexToDecimal(String hex){
        int decimalValue = 0;
        for (int i=0;i<hex.length();i++){
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue*16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }
    public static int hexCharToDecimal(char ch){
        if (ch>='A' &&ch<='F')
            return 10+ch-'A';
        else if (ch>='0'&&ch<='9')
            return ch-'0';
        else
            throw new NumberFormatException("NumberFormatException");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hex number: ");
        String hex = input.next();
        try {
            int x = hexToDecimal(hex);
            System.out.println(x);
        }
        catch (NumberFormatException ex){
            System.out.println("请输入十六进制数");
        }
    }
}
