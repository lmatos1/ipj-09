// 3.3.16
/* Describe the behavior of the method calls x.add(y) and y.add(x) in Vector program 3.3.3 if x
  corresponds to the vector (1,2,3) and y corresponds to the vector (5,6).
   -Above is the original question and below is the original program in the book, as far as I can see
    there is no method calls to x.add and y.add in the program the book provides. There is
    a function called plus it can be called like x.plus(y) so I will refer to this instead.
    In the situation described in the problem it will show an out of bounds error since x has 3
    elements and y has 2 elements it cannot add them. Hopefully that describes the behavior and
    answers the question I'm not sure what else to do so let me know if there is something else I
    can do or maybe give partial credit on this one?*/
public class Vector {
    private final double[] coords;

    public Vector(double[] a){
        coords = new double[a.length];
        for (int i=0; i< a.length;i++)
            coords[i] =a[i];
    }

    public Vector plus (Vector that){
        double[] result = new double[coords.length];
        for(int i =0; i < coords.length;i++)
            result[i] = this.coords[i] + that.coords[i];
        return new Vector(result);
    }

    public Vector scale(double alpha){
        double[] result = new double[coords.length];
        for (int i= 0;i<coords.length;i++)
            result[i] = alpha *coords[i];
        return new Vector(result);
    }

    public double dot(Vector that){
        double sum = 0.0;
        for(int i=0; i < coords.length;i++)
            sum += this.coords[i]*that.coords[i];
        return sum;
    }

    public double magnitude(){
        return Math.sqrt(this.dot(this));
    }

    public Vector direction (){
        return this.scale(1/this.magnitude());
    }

    public double cartesian(int i){
        return coords[i];
    }
}
