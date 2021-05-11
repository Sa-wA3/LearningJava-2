class AccountTester {

    public static void main(String[] args) {

        Account yamada = new Account("山田太郎", "123456", 1000);

        Account suzuki = new Account("鈴木次郎", "654321", 200);

        System.out.println("■山田くんの口座");
        System.out.println("　口座名義：" + yamada.getName());
        System.out.println("　口座番号：" + yamada.getNo());
        System.out.println("　預金残高：" + yamada.getBalance());
        System.out.println("　識別番号：" + yamada.getId());

        System.out.println("■鈴木くんの口座");
        System.out.println("　口座名義：" + suzuki.getName());
        System.out.println("　口座番号：" + suzuki.getNo());
        System.out.println("　預金残高：" + suzuki.getBalance());
        System.out.println("　識別番号：" + suzuki.getId());
    }
}