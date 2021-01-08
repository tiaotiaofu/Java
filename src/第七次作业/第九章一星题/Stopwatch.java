package 第七次作业.第九章一星题;
// 9.6(秒表)
import java.util.Random;

public class Stopwatch {
    public static void main(String[] args) {
        Stop a = new Stop();
        int[] nums = new int[100000];
        Random number = new Random();
        for (int i=0;i<100000;i++)
            nums[i] = number.nextInt(100000);
        a.startTime();
        for (int i=0;i<99999;i++){
            for (int j=i+1;j<100000;j++){
                if (nums[i]>nums[j]){
                    int t = nums[i];
                    nums[i] = nums[j];
                    nums[j] = t;
                }
            }
        }
        a.endTime();
        System.out.println(a.getElapsedTime());
    }
}
class Stop{
    private long startTime;
    private long endTime;
    public Stop(){
        startTime = System.currentTimeMillis();
    }
    public void startTime(){
        startTime = System.currentTimeMillis();
    }
    public void endTime(){
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return endTime - startTime;
    }
}