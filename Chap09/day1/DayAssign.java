import java.util.Scanner;

class DayAssign {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] wd = {"日", "月", "火", "水", "木", "金", "土"};

        System.out.println("誕生日を西暦で入力せよ。");
        System.out.print("年："); int y = sc.nextInt();
        System.out.print("月："); int m = sc.nextInt();
        System.out.print("日："); int d = sc.nextInt();

        Day birthday = new Day(y, m, d);

        System.out.println("あなたの誕生日" + birthday.getYear() + "年" + birthday.getMonth() + "月" + birthday.getDate() + "日は" + wd[birthday.dayOfWeek()] + "曜日です。");

        Day xDay = birthday;

        xDay.set(2100, 12, 31);

        System.out.println("birthday = " + birthday.getYear() + "年" + birthday.getMonth() + "月" + birthday.getDate() + "日（" + wd[birthday.dayOfWeek()] + "）");

        System.out.println("xDay = " + xDay.getYear() + "年" + xDay.getMonth() + "月" + xDay.getDate() + "日（" + wd[xDay.dayOfWeek()] + "）");

    }
}