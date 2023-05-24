public class Point {
    private final double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    /*implement quadrant method
      it should return the quadrant
      in the xy plane that the point
      is in as follows:
      1-first quadrant
      2-second quadrant
      3-third quadrant
      4-fourth quadrant
      0-origin point
    */
    public int quadrant() {
        if (x == 0 && y == 0)
            return 0;
        else if (x > 0 && y > 0)
            return 1;
        else if (x < 0 && y > 0)
            return 2;
        else if (x < 0 && y < 0)
            return 3;
        else
            return 4;
    }

}
