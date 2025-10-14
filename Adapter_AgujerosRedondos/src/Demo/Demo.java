package Demo;

import adapters.SquarePegAdapter;
import round.RoundHole;
import round.RoundPeg;
import square.SquarePeg;

/**
 *
 * @author aberr
 */



/**
 * En algún lugar del código del cliente...
 */
public class Demo {
    public static void main(String[] args) {
        // Lo redondo encaja con lo redondo
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // hole.fits(smallSqPeg); // Won't compile.

        // Adapter solves the problem.
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("El clavo cuadrado w2 encaja en el agujero redondo r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("La clavija cuadrada w20 no encaja en el agujero redondo r5.");
        }
    }
}