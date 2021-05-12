import java.util.Scanner;
import static java.lang.Math.PI;

public class Circle2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("円の面積を求めます。");
        System.out.print("半径：");
        double r = sc.nextDouble();
        System.out.println("面積は" + (PI * r * r) + "です。");
    }
}
