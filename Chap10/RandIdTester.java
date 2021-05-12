import java.util.Random;

class RandId {
    private static int counter;

    private int id;

    //--- クラス（静的）初期化子 ---//
    static {
        Random rand = new Random();
        counter = rand.nextInt(10) * 100;
    }

    public RandId() {
        id = ++counter;
    }

    public int getId() {
        return id;
    }
}

public class RandIdTester {
    public static void main(String[] args) {
        RandId a = new RandId();
        RandId b = new RandId();
        RandId c = new RandId();

        System.out.println("aの識別番号：" + a.getId());
        System.out.println("bの識別番号：" + b.getId());
        System.out.println("cの識別番号：" + c.getId());

    }
}
