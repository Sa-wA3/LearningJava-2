import java.util.Scanner;
import static java.lang.Math.PI;
import static java.lang.System.in;
import static java.lang.System.out;

public class Circle3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        out.println("円の面積を求めます。");
        out.print("半径：");
        double r = sc.nextDouble();
        out.println("面積は" + (PI * r * r) + "です。");

        //System             ・・・java.langパッケージに所属するクラス
        //System.out         ・・・Systemクラスのクラス（静的）変数）（型はPrintStreamクラス型）
        //System.out.println ・・・PrintStream草うのインスタンスメソッド
    }
}