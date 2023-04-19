package Point;

public class Point2D extends Point3D {
    private float z;

    public Point2D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), z};
    }

    @Override
    public String toString() {
        return "Point3D{" + "x=" + getX() + "y=" + getY() + "z=" + z + '}';
    }
}
