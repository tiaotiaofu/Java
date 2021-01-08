package 第十一次作业.抽象类和接口;
abstract class Animal{
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public abstract void eat();
}
class Cat extends Animal {
    public void eat(){
        System.out.println("猫喜欢吃鱼");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Cat a = new Cat();
        a.eat();
    }
}
