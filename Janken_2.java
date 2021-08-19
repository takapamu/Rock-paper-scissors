public class Janken_2 {
  public static void main(String[] args){

    System.out.println("じゃんけんおじさんが現れた!!");
    System.out.println("(^_^)v");
    System.out.println("男気ジャンケン！じゃんけんぽん！");

    String[] cpuhands = {"グー","チョキ","パー"};

    double d = Math.random();

    int i = (int)(Math.random() * 3);

    System.out.println("おじさんは" + cpuhands[i] + "を出してきた");
  }
}
