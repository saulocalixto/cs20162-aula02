package test.java.com.github.saulocalixto.exercicios;

import main.java.com.github.saulocalixto.exercicios.Mdceratostenes;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author saulocalixto
 */
public class MdceratostenesTest {
    
    @Test(expected = IllegalArgumentException.class)
    public void numInvalidoa() {

        Mdceratostenes.mdcErastones(10, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void numInvalidob() {

        Mdceratostenes.mdcErastones(-15, -7);
    }

    @Test
    public void numValido() {
        
        Mdceratostenes.mdcErastones(15, 20);
    }
    
    @Test
    public void apenasParaAgradarJacocoTool100PorCentoCobertura() {
        new Mdceratostenes();
    }    
}
