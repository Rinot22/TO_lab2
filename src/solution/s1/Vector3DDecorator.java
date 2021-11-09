package solution.s1;

import java.util.Arrays;

public class Vector3DDecorator implements IVector {
    private final IVector srcVector;
    private final double z;

    public Vector3DDecorator(IVector srcVector, double z) {
        this.srcVector = srcVector;
        this.z = z;
    }

    @Override
    public double abs() {
        return Math.sqrt(Math.pow(this.srcVector.getComponents()[0], 2) + Math.pow(this.srcVector.getComponents()[1], 2) + this.z*z);
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
        return new double[] {this.srcVector.getComponents()[0], this.srcVector.getComponents()[1], this.z};
    }

    public Vector3DInheritance cross(IVector v) {
        double x = this.srcVector.getComponents()[1] * v.getComponents()[2] - this.z * v.getComponents()[1];
        double y = -(this.srcVector.getComponents()[0] * v.getComponents()[2] - this.z * v.getComponents()[0]);
        double z = this.srcVector.getComponents()[0] * v.getComponents()[1] - this.srcVector.getComponents()[1] * v.getComponents()[0];

        return new Vector3DInheritance(x, y, z);
    }

    public IVector getSrc() {
        return this.srcVector;
    }

    @Override
    public String toString() {
        return "Vector3DDecorator kartesjanski{" +
                "srcVector =" + Arrays.toString(srcVector.getComponents()) +
                ", z =" + z +
                '}';
    }
}
