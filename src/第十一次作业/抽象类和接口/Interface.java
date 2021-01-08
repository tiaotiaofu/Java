package 第十一次作业.抽象类和接口;

public class Interface implements Animal1{
    public void eat(){
        System.out.println("猫喜欢吃鱼");
    }

    public static void main(String[] args) {
        Interface s = new Interface();
        s.eat();
    }
}
