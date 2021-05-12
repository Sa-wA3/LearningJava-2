import java.util.Random;

public class Point3D {
    //-- クラス変数 --//
    private static int counter = 0;
    
    //-- インスタンス変数 --//
    private int id;
    private int x = 0, y = 0, z = 0;

    //-- クラス初期化子 --//
    static { Random r = new Random(); counter = r.nextInt(10) * 100;}

    //-- インスタンス初期化子 --//
    { id = ++counter;}

    //-- コンストラクタ --//
    public Point3D() { }
    public Point3D(int x) { this.x = x;}
    public Point3D(int x, int y) { this.x = x; this.y = y;}
    public Point3D(int x, int y, int z) { this.x = x; this.y = y; this.z = z;}

    //--  クラスメソッド --//
    public static int getCounter() { return counter;}

    //-- インスタンスメソッド --//
    public int getId() {return id;}

    public String toString() {
        return "(" + x + "," + y + "," + z + ")";
    }
}
