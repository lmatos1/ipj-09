//3.3.5
public class Vector4 {
    private final double[] coords;

    public Vector4(double[] a){
        coords = new double[a.length];
        for (int i=0; i< a.length;i++)
            coords[i] =a[i];
    }

    public Vector4 plus (Vector4 that){
        double[] result = new double[coords.length];
        for(int i =0; i < coords.length;i++)
            result[i] = this.coords[i] + that.coords[i];
        return new Vector4(result);
    }

    public Vector4 scale(double alpha){
        double[] result = new double[coords.length];
        for (int i= 0;i<coords.length;i++)
            result[i] = alpha *coords[i];
        return new Vector4(result);
    }

    public double dot(Vector4 that){
        double sum = 0.0;
        for(int i=0; i < coords.length;i++)
            sum += this.coords[i]*that.coords[i];
        return sum;
    }

    public double magnitude(){
        return Math.sqrt(this.dot(this));
    }

    public Vector4 direction (){
        return this.scale(1/this.magnitude());
    }

    public double cartesian(int i){
        return coords[i];
    }
    public static void main(String[] args) {

 double[] arr = {1.2, 2.4, 3.6};

        Vector4 ob1 = new Vector4(arr);
        int i;
        System.out.print("ob1 Cords : ");

 for( i = 0 ; i < arr.length ; i++ )
System.out.print(ob1.cartesian(i) + " ");

 System.out.println("\n\nMagnitude : " + ob1.magnitude());

        double[] arr1 = {3.5, 7.4, 8.8};
        Vector4 ob2 = new Vector4(arr1);

System.out.print("ob2 Cords : ");

for( i = 0 ; i < arr1.length ; i++ )
 System.out.print(ob2.cartesian(i) + " ");

 System.out.println("\nob1.ob2 : " + ob1.dot(ob2));
 ob1.scale(2);

 System.out.println("\nAfter Scaling with 2 ...\n");

 System.out.print("ob1 Cords : ");

 for( i = 0 ; i < arr.length ; i++ )
 System.out.print(ob1.cartesian(i) + " ");

 System.out.println();

 Vector4 ob3 = ob1.plus(ob2);

 System.out.println("\nob3 = ob1 + ob2 ...\n");

 System.out.print("ob3 Cords : ");

 for( i = 0 ; i < arr.length ; i++ )
 System.out.print(ob3.cartesian(i) + " ");

    }
}
