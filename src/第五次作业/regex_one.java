package 第四次作业.第七章两星题;


public class regex_one {
    public static void main(String[] args) {
        String str="abc;123,456?999|haha";
        String[] strs= str.split("[;,?|25]");
        for (String s:strs){
            System.out.println(s);
        }
    }
}
