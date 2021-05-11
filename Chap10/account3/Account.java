public class Account {
    private static int counter = 0; //クラス変数（静的フィールド）

    private String name;    // インスタンス変数（非静的フィールド）
    private String no;      // インスタンス変数（非静的フィールド）
    private long balance;   // インスタンス変数（非静的フィールド）
    private int id;         // インスタンス変数（非静的フィールド）

    Account(String n, String num, long z) { //コンストラクタ
        name = n;
        no = num;
        balance = z;
        id = ++counter;
    }

    String getName() {
        return name;
    }

    String getNo() {
        return no;
    }

    long getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }

    void deposit(long k) {
        balance += k;
    }
    
    void withdraw(long k) {
        balance -= k;
    }
}