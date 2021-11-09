package solution.s1;

public class Vector2D implements IVector {
    protected double x;
    protected double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double abs() {
        return Math.sqrt(x*x + y*y);
    }

    @Override
    public double cdot(IVector v) {
        double vx = v.getComponents()[0];
        double vy = v.getComponents()[1];
        return this.x * vx + this.y * vy;
    }

    @Override
    public double[] getComponents() {
        return new double[] {x, y};
    }

    @Override
    public String toString() {
        return "Vector2D kartesjanski {" +
                "x = " + getComponents()[0] +
                ", y = " + getComponents()[1] +
                "}";
    }
}
