import java.util.Scanner;

class DayComparator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y, m, d;
        System.out.println("日付1を入力せよ。");
        System.out.print("年："); y = sc.nextInt();
        System.out.print("月："); m = sc.nextInt();
        System.out.print("日："); d = sc.nextInt();
        Day day1 = new Day(y, m, d);

        System.out.println("日付2を入力せよ。");
        System.out.print("年："); y = sc.nextInt();
        System.out.print("月："); m = sc.nextInt();
        System.out.print("日："); d = sc.nextInt();
        Day day2 = new Day(y, m, d);

        if (day1.getYear() == day2.getYear() && day1.getMonth() == day2.getMonth() && day1.getDate() == day2.getDate()) {
            System.out.println("等しいです。");
        }else {
            System.out.println("等しくありません。");
        }
    }
}