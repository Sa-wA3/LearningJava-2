
public class TimeAccountTester2 {
    
    static int compBalance(Account a, Account b) {
        if (a.getBalance() > b.getBalance()) {
            return 1;
        }else if (a.getBalance() < b.getBalance()) {
            return -1;
        }

        return 0;
    }


    public static void main(String[] args) {
        Account yamada = new Account("山田太郎", "123456", 1000);
        TimeAccount2 suzuki = new TimeAccount2("鈴木次郎", "654321", 200, 500);

        switch (compBalance(yamada, suzuki)) {
            case 0:
                System.out.println("山田君と鈴木君の預金残高は同じ。");
                break;
            case 1:
                System.out.println("山田君の方が預金残高が多い。");
                break;
            case -1:
                System.out.println("鈴木君の方が預金残高が多い。");
                break;
        }
}
}