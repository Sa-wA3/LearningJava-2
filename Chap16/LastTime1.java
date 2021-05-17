import java.io.*;
import java.util.Scanner;

public class LastTime1 {

    static void init() { //initメソッド
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("LastTime.txt"));
            String kibun = br.readLine();
            System.out.println("前回の気分は" + kibun + "でした。");

        } catch (IOException e) {
            System.out.println("このプログラムを実行すのは初めてですね。");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("ファイルクローズ失敗。");
                }
            }
        }
    }

    static void term(String kibun) { //termメソッド
        FileWriter fw = null;

        try {
            fw = new FileWriter("LastTime.txt");
            fw.write(kibun);
        } catch (IOException e) {
            System.out.println("エラー発生！");
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    System.out.println("ファイルクローズ失敗。");
                }
            }
        }
    }

    public static void main(String[] args) { //メインメソッド
        Scanner sc = new Scanner(System.in);

        init();

        System.out.print("今の気分は：");
        String kibun = sc.next();

        term(kibun);
    }
}

