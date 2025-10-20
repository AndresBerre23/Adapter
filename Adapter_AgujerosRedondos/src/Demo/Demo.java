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
        
        RoundHole hole = new RoundHole(5);//agujeros redondos de 5
        RoundPeg rpeg = new RoundPeg(5);
        
//        Verificamos que el plug redondo quepa en el agujero redondo
        if (hole.fits(rpeg)) {   
            System.out.println("Round peg r5 fits round hole r5.");
        }
        
        /*
        Los squarepeg (plug)  no serian directamente compatibles con el roundhole (tomas)
        */
        
        SquarePeg smallSqPeg = new SquarePeg(2);//cuadrado de ancho 2
        SquarePeg largeSqPeg = new SquarePeg(20);//cuadrado de ancho 20
//         hole.fits(smallSqPeg); // No compila

        // Adapter es la solucion
        
        //recibe el squarePeg y lo hara simular un roundPeg
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("El clavo cuadrado ancho 2 encaja en el agujero redondo r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("La clavija cuadrada ancho 20 no encaja en el agujero redondo r5.");
        }
    }
}