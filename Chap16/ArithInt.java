import java.util.Scanner;

public class ArithInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("xとyを加算乗除します。");

        System.out.print("xの値：");
        int x = sc.nextInt();

        System.out.print("yの値：");
        int y = sc.nextInt();
        
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));
    }
    
    //InputMismatchException：入力不適合の例外
    //ArithmeticException：算術演算の例外（0での除算）

}
