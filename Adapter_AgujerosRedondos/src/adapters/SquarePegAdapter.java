package adapters;

import round.RoundPeg;
import square.SquarePeg;

/**
 *
 * @author aberr
 */


/**
 * El adaptador permite encajar plug cuadradas en agujeros redondos.
 */
public class SquarePegAdapter extends RoundPeg {//extiende  plug redondo para que sea tratado como uno
    private SquarePeg peg;                             //peg=clavija

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        //Calcula el radio mínimo de un círculo que puede contener completamente el plug cuadrado
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
