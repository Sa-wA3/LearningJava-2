import java.util.Scanner;

public class HelloNextLine {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("お名前は：");
        String s = sc.nextLine(); //1行分の文字列を読み込む

        System.out.println("こんにちは" + s + "さん。");

    }
}
