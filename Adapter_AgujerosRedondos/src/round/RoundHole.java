package round;

/**
 *
 * @author aberr
 */

/**
 * RoundHoles are compatible with RoundPegs.
 */
public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        boolean result;
//       Si el agujero es igual o más grande, entonces el plug encaja.
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}
