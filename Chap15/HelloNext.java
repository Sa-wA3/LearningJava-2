import java.util.Scanner;

public class HelloNext {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("お名前は：");
        String s = sc.next(); //文字列を読み込む

        System.out.println("こんにちは" + s + "さん。");
    }
}
