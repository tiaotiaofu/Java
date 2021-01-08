package 第十四次作业.文件复制;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class method1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/第十四次作业/文件复制/method1_input.txt");
        File file1 = new File("src/第十四次作业/文件复制/method1_output.txt");
        Scanner input = new Scanner(file);
        PrintWriter output = new PrintWriter(file1);
        while (input.hasNext()){
            String a = input.nextLine();
//            System.out.println(a);
            output.println(a);
        }
        input.close();
        output.close();
    }
}
