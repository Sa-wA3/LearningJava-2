class Account {
    private String name;    //非公開アクセス
    private String no;      //非公開アクセス
    private long balance;   //非公開アクセス→データ隠蔽

    Account(String n, String num, long z) { //コンストラクタ
        name = n;
        no = num;
        balance = z;
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

    void deposit(long k) {
        balance += k;
    }

    void withdraw(long k) {
        balance -= k;
    }
}