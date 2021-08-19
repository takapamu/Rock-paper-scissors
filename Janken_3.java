import java.util.Scanner;

public class Janken_3 {
  public static void main(String[] args){

    System.out.println("じゃんけんおじさんが現れた!!");
    System.out.println("(^_^)v");
    System.out.println("男気ジャンケン！じゃんけんぽん！");

    String[] cpuhands = {"グー","チョキ","パー"};

    System.out.println("出したい番号を選んで下さい。[0]グー,[1]チョキ,[2]パー");
    Integer number = new Scanner(System.in).nextInt();

    System.out.println("あなたの出した手: " + cpuhands[number]);

    double d = Math.random();

    int i = (int)(Math.random() * 3);

    System.out.println("おじさんは[ " + cpuhands[i] + " ] を出してきた。");

    switch(number){
      case 0:
        if(i == 0){
          System.out.println("[あいこ]です");
        }else if(i == 1){
          System.out.println("[勝ち]ました");
        }else if(i == 2){
          System.out.println("[負け]ました");
        }
        break;
        case 1:
        if(i == 0){
          System.out.println("[負け]ました");
        }else if(i == 1){
          System.out.println("[あいこ]です");
        }else if(i == 2){
          System.out.println("[勝ち]ました");
        }
        break;
        case 2:
        if(i == 0){
          System.out.println("[勝ち]ました");
        }else if(i == 1){
          System.out.println("[負け]ました");
        }else if(i == 2){
          System.out.println("[あいこ]です");
        }
        break;
    }
  }
}
