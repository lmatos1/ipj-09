// 3.3.6
// made for particle
import java.util.Arrays;

public class Vector5 {

    private final double[] coords;

    public Vector5(double[] a) {
        coords = new double[a.length];
        for(int i = 0; i < coords.length; ++i) {
            coords[i] = a[i];
        }
    }

    public double dot(Vector5 that) {
        double sum = 0.0;
        for(int i = 0; i < coords.length; ++i) {
            sum += this.coords[i] * that.coords[i];
        }
        return sum;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Vector5 vector5 = (Vector5) object;

        return Arrays.equals(coords, vector5.coords);

    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(coords);
    }
}
