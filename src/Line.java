public class Line {
    private final Point start, end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }
    /*length function should be implemented
      it should return the Euclidean distance
      between start and end)*/

    public double length() {
        double d1 = Math.pow(Math.abs(start.getX() - end.getX()), 2);
        double d2 = Math.pow(Math.abs(start.getY() - end.getY()), 2);
        return Math.sqrt(d1 + d2);
    }
}
