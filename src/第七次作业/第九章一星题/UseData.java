package 第七次作业.第九章一星题;
import java.util.Date;
// 9.3 (使用日期类 Date)
public class UseData {
    public static void main(String[] args) {
        long time = 10000;
        Date date = new Date(10000);
        System.out.println(date.toString());
        for (int i=0;i<7;++i){
            time*=10;
            date.setTime(time);
            System.out.println(date.toString());
        }
    }
}
