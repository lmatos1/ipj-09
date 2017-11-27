//3.3.6
public class ParticleTestClient {

    public static void main(String[] args) {
        Particle particle = new Particle(new Vector5(new double[]{0, 0, 0}), new Vector5(new double[]{1, 2, 3}), 10);
        System.out.println("Kinetic energy: " + particle.energy());
    }

}
