package 第十三次作业.异常;
// 12.9
import java.util.Scanner;

public class BinaryFormatExceptionError {
    public static class BinaryFormatException extends Exception{
        public BinaryFormatException(String msg){
            super(msg);
        }
    }
    public static int binTODec(String hex) throws BinaryFormatException{
        int decimalValue = 0;
        for (int i=0;i<hex.length();i++){
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue*2 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }
    public static int hexCharToDecimal(char ch) throws BinaryFormatException {
        if (ch>='0' &&ch<='1')
            return ch-'0';
        else
            throw new BinaryFormatException("BinaryFormatException");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a bin number: ");
        String hex = input.next();
        try {
            int x = binTODec(hex);
            System.out.println(x);
        }
        catch (BinaryFormatException ex){
            System.out.println("BinaryFormatException,请输入二进制数");
        }
    }
}
