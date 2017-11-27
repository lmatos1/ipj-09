//3.3.13
import java.util.Arrays;

public class Vector2 {

    private final double[] coords;

    public Vector2(double[] a) {
        coords = new double[a.length];
        for(int i = 0; i < coords.length; ++i) {
            coords[i] = a[i];
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Vector2 vector2 = (Vector2) object;

        return Arrays.equals(coords, vector2.coords);

    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(coords);
    }
}