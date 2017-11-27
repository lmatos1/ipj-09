//3.3.6
public class Particle {

    private Vector5 position;
    private Vector5 velocity;
    private int mass;

    public Particle(Vector5 position, Vector5 velocity, int mass) {
        this.position = position;
        this.velocity = velocity;
        this.mass = mass;
    }

    public double energy() {
        return 0.5 * mass * velocity.dot(velocity);
    }

}
