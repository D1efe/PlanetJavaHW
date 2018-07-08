
import java.util.HashMap;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import periodictablejava.Elements;

public class PTTesting {

    //only testThree relates to the task. The prior tasks were from me misunderstanding the task.
    @Test
    public void testOne() {

        Elements one = new Elements();

        assertEquals("Ir", one.proposeSymbol("fire"));
        assertEquals("In", one.proposeSymbol("tin"));
        assertEquals("Ye", one.proposeSymbol("hydrogen"));
        assertEquals("Nn", one.proposeSymbol("xenon"));

    }

    @Test
    public void testTwo() {

        Elements one = new Elements();

        assertEquals(true, one.chekSymbol("Sveggjerium", "Ee"));
        assertEquals(true, one.chekSymbol("Zockurijirium", "Uu"));
        assertEquals(true, one.chekSymbol("Jeffkanium", "Ff"));
        assertEquals(false, one.chekSymbol("Jefftzlo", "Zt"));
        assertEquals(false, one.chekSymbol("Jeffntzum", "Nn"));
        assertEquals(false, one.chekSymbol("Tuffjeffium", "Ty"));

    }

    @Test
    public void testThree() {

        Elements one = new Elements();

        assertEquals(true, one.chekSymbol("Sveggjerium", "Ee"));
        assertEquals(true, one.chekSymbol("Zockurijirium", "Zr"));
        assertEquals(true, one.chekSymbol("Jeffkanium", "Kn"));
        assertEquals(false, one.chekSymbol("Jefftzlo", "Zt"));
        assertEquals(false, one.chekSymbol("Jeffntzum", "Nn"));
        assertEquals(false, one.chekSymbol("Tuffjeffium", "Ty"));
    }

//    public void testfour() {
//
//        Elements one = new Elements();
//
//        String[] elements = {"Hydrogen\n"
//            + "Helium\n"
//            + "Lithium\n"
//            + "Beryllium\n"
//            + "Boron\n"
//            + "Carbon\n"
//            + "Nitrogen\n"
//            + "Oxygen\n"
//            + "Fluorine\n"
//            + "Neon\n"
//            + "Sodium\n"
//            + "Magnesium\n"
//            + "Aluminium\n"
//            + "Silicon"};
//
//        assertEquals(true, one.getSymbols(elements));
//
//    }

}
