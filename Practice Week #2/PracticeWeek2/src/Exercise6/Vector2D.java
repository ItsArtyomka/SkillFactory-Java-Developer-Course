package Exercise6;

public class Vector2D extends Vector {
    // 2D Vector Constructor
    public Vector2D(int x1, int y1, int x2, int y2) {
        super(x1, y1, 0, x2, y2, 0); // z1 and z2 = 0 because it is a 2D vector.
    }

    // Length of the vector = Magnitude of the vector aka ||a|| = sqrt((value of x)^2 + (value of y)^2)
    // There are x/y 1 - x/y 2 because the starting point is (x1, y1) so x/y 2 - x/y 1 will give a -ve vector
    @Override
    public double getLength() {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    // There are x/y 2 - x/y 1 because that's the convention of representing a vector as difference of two point,
    // aka end point cords - start point cords.
    @Override
    public String getVectorCords() {
        return (x2 - x1) + " " + (y2 - y1);
    }

    // Calculating scalar product of a 2D vector aka Dot Product,
    // Dot product of the first vector and the second(input) vector.
    public double getScalarProduct(Vector2D vector2D) {
        String cords = getVectorCords(); // Vector a
        String cords2 = vector2D.getVectorCords(); // Vector b

        // Dot Product is vector a multiplied by vector b.
        // split() function creates cords String array and split(" ") removes the space and just leaves the value,
        // [0] gets x value of cords and cords2, [1] gets the y value of cords and cords2
        // Integer.parseInt returns int value that was stored as an integer.
        return Integer.parseInt(cords.split(" ")[0]) * Integer.parseInt(cords2.split(" ")[0]) +
                Integer.parseInt(cords.split(" ")[1]) * Integer.parseInt(cords2.split(" ")[1]);
    }

    // Finds the cosine angle between the first vector and second(input) vector.
    // Formula to find the cosine of an angle = Scalar Product of Vectors divided by Product of Vectors' Magnitudes.
    public double getAngle(Vector2D vector2D) {
        if (getLength() != 0 && vector2D.getLength() != 0) {
            return getScalarProduct(vector2D) / (this.getLength() * vector2D.getLength());
        } else return -2.0;
    }
}
