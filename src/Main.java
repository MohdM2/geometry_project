import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(-1, -1);
        Point p2 = new Point(2, 3);
        Line l = new Line(p1, p2);
        System.out.println(p1.quadrant());
        System.out.println(p2.quadrant());
        System.out.println(l.length());
    }
}