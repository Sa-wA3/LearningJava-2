public class Plane2DTester {

    public static void main(String[] args) {
        Rectangle[] a = new Rectangle[2];
        a[0] = new Rectangle(5, 4);
        a[1] = new Rectangle1(5, 4);

        for (Rectangle s : a) {
            s.print();  //こっちは通る
            s.getHoge(); //通ってほしい
            System.out.println();
        }
    } 
}
