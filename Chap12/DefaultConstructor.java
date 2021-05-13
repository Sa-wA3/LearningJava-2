
class A { //上位クラス
    private int a;

    A() { a = 50; }

    int getA() { return a;}
}

class B extends A {

}

class DefaultConstructor {

    public static void main(String[] args) {

        B x = new B();

        System.out.println("x.getA() = " + x.getA());

    }
}


