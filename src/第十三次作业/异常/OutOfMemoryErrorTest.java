package 第十三次作业.异常;
// 12.10
public class OutOfMemoryErrorTest {
    public static void main(String[] args) {
        try {
            int a[] = new int[1000000000];
            System.out.println(a);
        }
        catch(OutOfMemoryError ex){
            System.out.println("OutOfMemoryError");
        }
    }

}
