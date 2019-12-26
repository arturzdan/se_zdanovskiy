package sef.module6.activity;

/**
 * @author John Doe
 * <p>
 * This class represents a point in 3D space.  The coordinates are represented by
 * a set of values x, y an z that represents the coordinates along each plane
 */
public class Point3DImpl extends Point2DImpl implements Point3D {

    private double z;
    private double x;
    private double y;

    /**
     * Creates a Point3D object with the default coordinate of 0,0,0
     */
    public Point3DImpl() {
        z = 0;
        x = 0;
        y = 0;
    }

    /**
     * Creates a Point3D object at the specified coordinates
     *
     * @param x coordinate along the x axis
     * @param y coordinate along the y axis
     * @param z coordinate along the z axis
     */
    public Point3DImpl(double x, double y, double z) {
        this.z = z;
        this.x = x;
        this.y = y;
    }


    /* (non-Javadoc)
     * @see sef.module5.activity.Point3D#setZ(double)
     */
    public final void setZ(double z) {
        this.z = z;
    }


    /* (non-Javadoc)
     * @see sef.module5.activity.Point3D#getZ()
     */
    public final double getZ() {
        return z;
    }

    /* (non-Javadoc)
     * @see sef.module5.activity.Point3D#getX()
     */
    public double getX() {
        return x;
    }


    /* (non-Javadoc)
     * @see sef.module5.activity.Point3D#getY()
     */
    public double getY() {
        return y;
    }

    /* (non-Javadoc)
     * @see sef.module5.activity.Point3D#move(double, double, double)
     */
    public void move(double x2, double y2, double z2) {
        z = z2;
        x = x2;
        y = y2;
    }


    /* (non-Javadoc)
     * @see sef.module5.activity.Point3D#translate(double, double, double)
     */
    public void translate(double x2, double y2, double z2) {
        this.x += x2;
        this.y += y2;
        this.z += z2;
    }


    /* (non-Javadoc)
     * @see sef.module5.activity.Point3D#equals(double, double, double)
     */
    public boolean equals(double x2, double y2, double z2) {
        if (this.z != z2)
            return false;
        if (this.x != x2)
            return false;
        if (this.y != y2)
            return false;
        return true;
    }


    /**
     * Compares if the coordinates are equal to the coordinates specified by the parameter
     *
     * @param p the coordinates to compare
     * @return true if the parameter is an instance of Point3D and contain the same coordinates, false otherwise
     */
    public boolean equals(Object p) {
        Point3DImpl point = (Point3DImpl) p;
        if (this.z != point.getZ())
            return false;
        if (this.x != point.getX())
            return false;
        if (this.y != point.getY())
            return false;
        return true;
    }


    /* (non-Javadoc)
     * @see sef.module5.activity.Point3D#getDistance(sef.module5.activity.Point3D)
     */
    public double getDistance(Point3D p) {
        double a = x - p.getX();
        double b = y - p.getY();
        double c = z - p.getZ();
        double dist = Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2);
        return Math.sqrt(dist);
    }


    /* (non-Javadoc)
     * @see sef.module5.activity.Point3D#getDistance(double, double, double)
     */
    public double getDistance(double x2, double y2, double z2) {
        double a = x - x2;
        double b = y - y2;
        double c = z - z2;
        double dist = Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2);
        return Math.sqrt(dist);
    }
}
