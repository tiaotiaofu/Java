package 第九次作业.多态;

public class Polymorphism {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println("The color of the cat is " + cat.getColor());
        cat.call();
        cat.originalCall();
    }
     static class Animal{
        private String color = "white";

        public void setColor(String color){
            this.color = color;
        }
        public String getColor(){
            return color;
        }
        public void call(){
            System.out.println("动物可以发出叫声");
        }
    }
    static class Cat extends Animal{
        public void call(){
            System.out.println("猫可以发出喵喵声");
        }
        public void originalCall(){
            super.call();
        }
    }
}
