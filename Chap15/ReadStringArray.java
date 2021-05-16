import java.util.Scanner;

public class ReadStringArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("文字列の個数：");
        int n = sc.nextInt();
        String[] sx = new String[n];

        for (int i = 0; i < sx.length; i++) {
            System.out.print("sx[" + i + "] = ");
            sx[i] = sc.next();
        }
        for (int j = 0; j < sx.length; j++) {
            System.out.println("sx[" + j + "] = " + sx[j]);
        }
    }
}
