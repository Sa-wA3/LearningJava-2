import java.util.Scanner;

public class CarTester3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("車のデータを入力せよ。");
        System.out.print("名前は：");       String name = sc.next();
        System.out.print("車幅は：");       int width = sc.nextInt();
        System.out.print("高さは：");       int height = sc.nextInt();
        System.out.print("長さは：");       int length = sc.nextInt();
        System.out.print("ガソリン量は：");  double fuel = sc.nextDouble();
        System.out.print("購入年");         int y = sc.nextInt();
        System.out.print("購入月");         int m = sc.nextInt();
        System.out.print("購入日");         int d = sc.nextInt();

        Car car2 = new Car(name, width, height, length, fuel, new Day(y, m, d));

        car2.putSpec();
        System.out.println("購入日：" + car2.getPurchaseDay());

    }
}
