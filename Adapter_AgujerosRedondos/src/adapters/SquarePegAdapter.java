package adapters;

import round.RoundPeg;
import square.SquarePeg;

/**
 *
 * @author aberr
 */


/**
 * El adaptador permite encajar clavijas cuadradas en agujeros redondos.
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;                             //peg=clavija

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        //Calcula el radio mínimo de un círculo que pueda acomodar.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
