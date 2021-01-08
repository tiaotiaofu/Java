package 第七次作业.第九章一星题;
import java.util.Random;
// 9.4 (使用随机类 Random)
public class UseRandom {
    public static void main(String[] args) {
        Random random1 = new Random(1000);
        for (int i =0; i<50;++i){
            System.out.println(random1.nextInt(100));
        }
    }
}