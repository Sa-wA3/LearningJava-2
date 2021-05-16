import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionSample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("xとyを加算乗除します。");

        while (true) {
            try {
                System.out.print("xの値：");
                int x = sc.nextInt();
                System.out.print("yの値：");
                int y = sc.nextInt();
                
                System.out.println("x + y = " + (x + y));
                System.out.println("x - y = " + (x - y));
                System.out.println("x * y = " + (x * y));
                System.out.println("x / y = " + (x / y));
                System.out.println("x % y = " + (x % y));
            } catch (InputMismatchException e) { //java.util.InputMismatchExceptionに対しての対処
                System.out.println("入力エラー発生。" + e);
                String s = sc.next();
                System.out.println(s + "は無視しました。"); //java.util.ArithmeticExceptionに対しての対処
            } catch (ArithmeticException e) {
                System.out.println("算術エラー発生。" + e);
                System.out.println("エラーが出ないような数値をお願いします。");
            } finally {
                System.out.println("--------------------------------------");
                System.out.print("もう一度？（1：Yes / 0：No）：");
                int retry = sc.nextInt();
                if (retry == 0) {
                    break;
                }
                System.out.println("--------------------------------------");
            }
        }
    }    
}
