// 3.3.14
public class Vector3 {

    private final double[] coords;

    public Vector3(double[] a) {
        coords = new double[a.length];
        for (int i = 0; i < a.length; i++)
            this.coords[i] = a[i];
    }

    public Vector3 plus(Vector3 that) {
        double[] result =  new double[coords.length];
        for (int i = 0; i < coords.length; i++)
            result[i] = this.coords[i] + that.coords[i];
        return new Vector3(result);
    }


    public Vector3 scale(double alpha) {
        double[] result =  new double[coords.length];
        for (int i = 0; i < coords.length; i++)
            result[i] = alpha * coords[i];
        return new Vector3(result);
    }

    public double dot(Vector3 that) {
        double sum = 0.0;
        for (int i = 0; i < coords.length; i++)
            sum += this.coords[i] * that.coords[i];
        return sum;
    }

    public double magnitude() {
        return Math.sqrt(this.dot(this));
    }

    public Vector3 direction() {
        return this.scale(1 / this.magnitude());
    }

    public double cartesian(int i) {
        return coords[i];
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('(');
        for (int i = 0; i < coords.length; i++) {
            stringBuilder.append(coords[i]);
            if (i < coords.length-1) stringBuilder.append(", ");
        }
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}
