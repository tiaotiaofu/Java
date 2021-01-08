package 第七次作业.第九章一星题;

import java.util.GregorianCalendar;

//9.5 (使用公历类 GregorianCalendar )
public class UseGregorianCalendar {
    public static void main(String[] args) {
        GregorianCalendar a = new GregorianCalendar();
        System.out.print("当前时间：");
        System.out.println(a.get(GregorianCalendar.YEAR)+"-"+a.get(GregorianCalendar.MONTH)+"-"+a.get(GregorianCalendar.DAY_OF_MONTH));
        a.setTimeInMillis(1234567898765L);
        System.out.println(a.get(GregorianCalendar.YEAR)+"-"+a.get(GregorianCalendar.MONTH)+"-"+a.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
