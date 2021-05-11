import java.util.Scanner;

class DayTester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("日付1を入力せよ。");
        System.out.print("年："); int y = sc.nextInt();
        System.out.print("月："); int m = sc.nextInt();
        System.out.print("日："); int d = sc.nextInt();
        
        Day day1 = new Day(y, m, d);
        System.out.println("day1 = " + day1);

        Day day2 = new Day(day1);
        System.out.println("day2をday1と同じ日付として作りました。");
        System.out.println("day2 = " + day2);

        if (day1.equalTo(day2)) {
            System.out.println("day1とday2は等しいです。");
        }else {
            System.out.println("day1とday2は等しくありません。");
        }

        Day d1 = new Day();
        Day d2 = new Day(2010);
        Day d3 = new Day(2010, 10);
        Day d4 = new Day(2010, 10, 15);

        System.out.println("d1   = " + d1);
        System.out.println("d2   = " + d2);
        System.out.println("d3   = " + d3);
        System.out.println("d4   = " + d4);

        Day[] a = new Day[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Day();
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}