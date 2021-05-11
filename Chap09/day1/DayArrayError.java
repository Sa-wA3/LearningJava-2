import java.util.Scanner;

class DayArrayError {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] wd = {"日", "月", "火", "水", "木", "金", "土"};

        System.out.print("日付は何個：");
        int n = sc.nextInt();

        Day[] a = new Day[n];

        for (int i = 0; i < a.length; i++) {
            a[i].set(2017, 10, 15);
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i].getYear() + "年" + a[i].getMonth() + "月" + a[i].getDate() + "日（" + wd[a[i].dayOfWeek()] + "）");
        }
    }
}