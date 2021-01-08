package 第三章两星题;

//3.4 (随机月份）

public class randomMonth {
    public static void main(String[] args) {
        String[] list1 = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        int a = (int) (Math.random()*11+1);
        System.out.println(a);
        System.out.println(list1[a-1]);
    }
}
