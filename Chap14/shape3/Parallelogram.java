public class Parallelogram extends Shape  {
    private int width;
    private int height;

    public Parallelogram(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public String toString() {
        return "Parallerogram(width:" + width + ", height:" + height + ")"; 
    }

    public void draw() {
        for ( int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= width; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public int getArea() {
        return width * height;
    }
}
