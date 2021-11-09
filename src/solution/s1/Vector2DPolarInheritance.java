package solution.s1;

public class Vector2DPolarInheritance extends Vector2D {
    public Vector2DPolarInheritance(double x, double y) {
        super(x, y);
    }

    public double getAngle() {
        Vector2D oxVector = new Vector2D(1.0, 0.0);

        double cosAngle = (this.cdot(oxVector)) / (this.abs() * oxVector.abs());
        return Math.toDegrees(Math.acos(cosAngle));
    }

    @Override
    public String toString() {
        return "Vector2DPolarInheritance kartesjanski {" +
                "x = " + getComponents()[0] +
                ", y = " + getComponents()[1] +
                "}\n" +
                "Vector2DPolarInheritance biegonowy {" +
                "fi = " + this.getAngle() +
                ", r = " + this.abs() + "}";
    }
}
