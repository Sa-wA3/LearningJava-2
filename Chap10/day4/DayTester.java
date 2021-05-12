import java.util.Scanner;

public class DayTester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y, m, d;

        System.out.print("西暦年：");
        y = sc.nextInt();
        System.out.println("その年は閏年" + (Day.isLeap(y) ? "です。" : "ではありません。")); //クラスメソッド（静的メソッド）の呼び出し

        System.out.println("日付を入力せよ。");
        System.out.print("年：");   y = sc.nextInt();
        System.out.print("月：");   m = sc.nextInt();
        System.out.print("日：");   d = sc.nextInt();
        Day a = new Day(y, m, d);
        System.out.println(a.getYear() + "年は閏年" + (a.isLeap() ? "です。" : "ではありません。")); //インスタンスメソッドの呼び出し

    }
}
