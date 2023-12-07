import java.util.Random;

public class GaussRandom {
    Random random;

    public GaussRandom(long seed) {
        this.random = new Random(seed);
    }

    public GaussRandom() {
        this.random = new Random();
    }

    public double nextNormal() {
        return nextNormal(0, 1);
    }

    public double nextNormal(double mean, double stdDev) {
        double u1 = 1.0 - random.nextDouble();
        double u2 = 1.0 - random.nextDouble();
        double randStdNormal = Math.sqrt(-2.0 * Math.log(u1)) *
                Math.sin(2.0 * Math.PI * u2);
        return mean + stdDev * randStdNormal;
    }

}