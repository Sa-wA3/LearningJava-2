
//--- 単一型インポート宣言 ---//
import java.util.Scanner; //ここでimport宣言をしているから

public class Circle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //ここで単純名を使用できる→import宣言なしだと java.util.Scanner sc = new Scanner(System.in);

        System.out.println("円の面積を求めます。");
        System.out.print("半径：");
        double r = sc.nextDouble();
        System.out.println("面積は" + (Math.PI * r * r) + "です。");
    }
}
