package Point;

public class Point3D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point3D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point3D() {

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY (){
        return new float[]{x,y};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
