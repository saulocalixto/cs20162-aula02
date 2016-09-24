package test.java.com.github.saulocalixto.exercicios;

import com.github.saulocalixto.exercicios.Mdc;
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
public class MdcTest {
    
    /**
     *
     */
    @Test(expected = IllegalArgumentException.class)
    public void numInvalidoa() {

        Mdc.mDc(10, 3);
    }

    /**
     *
     */
    @Test(expected = IllegalArgumentException.class)
    public void numInvalidob() {

        Mdc.mDc(-15, -7);
    }

    /**
     *
     */
    @Test
    public void numValido() {
        
        Mdc.mDc(15, 20);
    }
    
    /**
     *
     */
    @Test
    public void apenasParaAgradarJacocoTool100PorCentoCobertura() {
        new Mdc();
    }    
}