package 第十四次作业.文件复制;

import java.io.*;

public class method2 {
    public static void main(String[] args) {
        int n = 0;
        try {
            FileInputStream file = new FileInputStream("src/第十四次作业/文件复制/method2_input.txt");
            FileOutputStream file1 = new FileOutputStream("src/第十四次作业/文件复制/method2_output.txt");
            while ((n=file.read())!=-1){
                file1.write(n);
            }
            file.close();
            file1.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
