package test.java.com.github.saulocalixto.exercicios;

import com.github.saulocalixto.exercicios.MdcEratostenes;
import org.junit.Test;

/**
 *
 * @author saulocalixto
 */
public class MdcEratostenesTest {
    
    /**
     *
     */
    @Test(expected = IllegalArgumentException.class)
    public void numInvalidoa() {

        MdcEratostenes.mdcErastones(10, 3);
    }

    /**
     *
     */
    @Test(expected = IllegalArgumentException.class)
    public void numInvalidob() {

        MdcEratostenes.mdcErastones(-15, -7);
    }

    /**
     *
     */
    @Test
    public void numValido() {
        
        MdcEratostenes.mdcErastones(15, 20);
    }
    
    /**
     *
     */
    @Test
    public void apenasParaAgradarJacocoTool100PorCentoCobertura() {
        new MdcEratostenes();
    }    
}
