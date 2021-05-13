public class TimeAccountTester {
    
    public static void main(String[] args) {
        Account yamada = new Account("山田太郎", "123456", 1000);
        TimeAccount2 suzuki = new TimeAccount2("鈴木次郎", "654321", 200, 500);

        Account x;
        x = yamada;
        x = suzuki;

        System.out.println("xの預金残高：" + x.getBalance());

        TimeAccount2 y;
        y = yamada;
        y = suzuki;

        System.out.println("yの預金残高：" + y.getTieBalance);
    }
}
