package 第十三次作业.异常;
// 12.8
import java.util.Scanner;

public class HexFormatExceptionError {
    public static class HexFormatException extends Exception {
        public HexFormatException(String msg) {
            super(msg);
        }
    }
    public static int hexToDecimal(String hex) throws HexFormatException {
        int decimalValue = 0;
        for (int i=0;i<hex.length();i++){
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue*16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }
    public static int hexCharToDecimal(char ch) throws HexFormatException {
        if (ch>='A' &&ch<='F')
            return 10+ch-'A';
        else if (ch>='0'&&ch<='9')
            return ch-'0';
        else
            throw new HexFormatException("HexFormatException");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hex number: ");
        String hex = input.next();
        try {
            int x = hexToDecimal(hex);
            System.out.println(x);
        }
        catch (HexFormatException ex){
            System.out.println("HexFormatException,请输入十六进制数");
        }
    }
}
