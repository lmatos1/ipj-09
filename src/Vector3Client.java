//3.3.14 test client
public class Vector3Client {

    public static void main(String[] args) {
        double[] testVector = { 5.0, 2.0, 8.0, 4.0 };

        Vector vector = new Vector(testVector);

        String vectorToString = vector.toString();

        System.out.println("Vector converted to string using toString() method is: " + vectorToString);
    }
}