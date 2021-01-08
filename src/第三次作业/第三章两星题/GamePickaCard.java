package 第三次作业.第三章两星题;
//3.24 ( 游戏：挑一张牌）
public class GamePickaCard {
    public static void main(String[] args) {
        int number1 = (int)(Math.random()*4);
        String a= new String();
        if (number1==0)
            a="Clubs";
        else if (number1==1)
            a="Diamonds";
        else if (number1==2)
            a="Hearts";
        else
            a="Spades";
        int number2 = (int)(Math.random()*13+1);
        if (number2==1)
            System.out.println("The card you picked is Ace of "+a);
        else if(number2==11)
            System.out.println("The card you picked is Jack of "+a);
        else if(number2==12)
            System.out.println("The card you picked is Queen of "+a);
        else if(number2==13)
            System.out.println("The card you picked is King of "+a);
        else
            System.out.println("The card you picked is "+number2+" of "+a);
    }
}
