import java.util.Scanner;

public class Janken{
  public static void main(String[] args){

    System.out.println("最初はグー! じゃんけんぽん!");

    String[] cpuhands = {"グー", "チョキ", "パー"};

    System.out.println("出したい番号を選んでください\n[0]グー\n[1]チョキ\n[2]パー");
    Integer number = new Scanner(System.in).nextInt();

    System.out.println("あなたの出した手: " + cpuhands[number]);
  }
}