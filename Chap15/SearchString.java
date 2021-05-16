import java.util.Scanner;

public class SearchString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("文字列s1：");
        String s1 = sc.next();
        System.out.print("文字列s2：");
        String s2 = sc.next();

        int idx = s1.indexOf(s2);
        if (idx == -1) {
            System.out.println("s1中にs2は含まれません。");
        }else {
            System.out.println("s1の" + (idx + 1) + "文字目にs2が含まれます。");
        }

    }

}
