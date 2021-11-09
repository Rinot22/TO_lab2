package solution.s1;

public class Vector3DInheritance extends Vector2D {
    private final double z;

    public Vector3DInheritance(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public double abs() {
        return Math.sqrt(Math.pow(this.getComponents()[0], 2) + Math.pow(this.getComponents()[1], 2) + this.z*z);
    }

    @Override
    public double cdot(IVector v) {
        double vx = v.getComponents()[0];
        double vy = v.getComponents()[1];
        double vz = v.getComponents()[2];
        return this.getComponents()[0] * vx + this.getComponents()[1] * vy + this.getComponents()[2] * vz;
    }

    @Override
    public double[] getComponents() {
        return new double[] {this.x, this.y, this.z};
    }

    public Vector3DInheritance cross(IVector vector) {
        double x = this.y * vector.getComponents()[2] - this.z * vector.getComponents()[1];
        double y = -(this.x * vector.getComponents()[2] - this.z * vector.getComponents()[0]);
        double z = this.x * vector.getComponents()[1] - this.y * vector.getComponents()[0];

        return new Vector3DInheritance(x, y, z);
    }

    @Override
    public String toString() {
        return "Vector3DInheritance kartesjanski {" +
                "x = " + getComponents()[0] +
                ", y = " + getComponents()[1] +
                ", z = " + z +
                "}";
    }
}
