public class StringConstructor {
    
    public static void main(String[] args) {
        char[] c = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};

        String s1 = new String();

        String s2 = new String(c);

        String s3 = new String(c, 5, 3);

        String s4 = new String("XYZ");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
