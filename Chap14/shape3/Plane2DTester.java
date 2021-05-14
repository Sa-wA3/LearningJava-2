public class Plane2DTester {
   public static void main(String[] args) {
       Shape[] a = new Shape[2];
        a[0] = new Rectangle(5, 4);
        a[1] = new Parallelogram(5, 4);

        for (Shape s : a) {
            s.print();
            s.getArea();
            System.out.println();
        }

   } 
}
