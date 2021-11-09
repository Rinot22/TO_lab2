package solution.s1;

public class Polar2DAdapter implements IVector, IPolar2D{
    private final Vector2D srcVector;

    public Polar2DAdapter(Vector2D srcVector) {
        this.srcVector = srcVector;
    }


    @Override
    public double getAngle() {
        Vector2D oxVector = new Vector2D(1.0, 0.0);

        double cosAngle = (this.cdot(oxVector)) / (this.abs() * oxVector.abs());
        return Math.toDegrees(Math.acos(cosAngle));
    }

    @Override
    public double abs() {
        return this.srcVector.abs();
    }

    @Override
    public double cdot(IVector v) {
        return this.srcVector.cdot(v);
    }

    @Override
    public double[] getComponents() {
        return this.srcVector.getComponents();
    }

    @Override
    public String toString() {
        return "Polar2DAdapter kartesjanski {" +
                "x = " + srcVector.getComponents()[0] +
                ", y = " + srcVector.getComponents()[1] +
                "}\n" +
                "Polar2DAdapter biegonowy {" +
                "fi = " + this.getAngle() +
                ", r = " + this.abs() + "}";
    }
}
