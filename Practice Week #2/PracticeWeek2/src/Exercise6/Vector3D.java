package Exercise6;

public class Vector3D extends Vector {
    // 3D Vector Constructor
    public Vector3D(int x1, int y1, int z1, int x2, int y2, int z2) {
        super(x1, y1, z1, x2, y2, z2);
    }

    // Length of the vector = Magnitude of the vector aka ||a|| = sqrt((value of x)^2 + (value of y)^2 + (value of z)^2),
    // There are x/y/z 1 - x/y/z 2 because the starting point is (x1, y1, z1) so x/y/z 2 - x/y/z 1 will give a -ve vector.
    @Override
    public double getLength() {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) + Math.pow(z1 - z2, 2));
    }

    // There are x/y/z 2 - x/y/z 1 because that's the convention of representing a vector as difference of two point,
    // aka end point cords - start point cords.
    @Override
    public String getVectorCords() {
        return (x2 - x1) + " " + (y2 - y1) + " " + (z2 - z1);
    }

    // Calculating scalar product of a 3D vector aka Dot Product,
    // Dot product of the first vector and the second(input) vector.
    public double getScalarProduct(Vector3D vector3D) {
        String cords = getVectorCords();
        String cords2 = vector3D.getVectorCords();

        int a = Integer.parseInt(cords.split(" ")[0]) * Integer.parseInt(cords2.split(" ")[0]);
        int b = Integer.parseInt(cords.split(" ")[1]) * Integer.parseInt(cords2.split(" ")[1]);
        int c = Integer.parseInt(cords.split(" ")[2]) * Integer.parseInt(cords2.split(" ")[2]);
        return a + b + c;
    }
}
