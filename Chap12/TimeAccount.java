
class TimeAccount {
    private String name;      //口座名義
    private String no;        //口座番号
    private long balance;     //預金残高
    private long timeBalance; //預金残高（定期預金）

    Account(String n, String num, long z, long timeBalance) { //コンストラクタ
        name = n;                       //口座名義
        no = num;                       //口座番号
        balance = z;                    //預金残高
        this.timeBalance = timeBalance; //預金残高（定期預金）
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

    long gettimeBalance() {
        return timeBalance;
    }

    void deposit(long k) {
        balance += k;
    }

    void withdraw(long k) {
        balance -= k;
    }

    void cancel() {
        balance += timeBalance;
        timeBalance = 0;
    }
}