package test.java.com.github.saulocalixto.exercicios;

import main.java.com.github.saulocalixto.exercicios.Produto;
import org.junit.Test;

/**
 *
 * @author saulocalixto
 */
public class ProdutoTest {
    
    /**
     *
     */
    @Test(expected = IllegalArgumentException.class)
    public void numInvalidoa() {

        Produto.resultado(-1, 4);
    }

    /**
     *
     */
    @Test(expected = IllegalArgumentException.class)
    public void numInvalidob() {

        Produto.resultado(1, -4);
    }

    /**
     *
     */
    @Test(expected = IllegalArgumentException.class)
    public void numInvalidoab() {

        Produto.resultado(-1, -4);
    }

    /**
     *
     */
    @Test
    public void numValido() {
        
        Produto.resultado(1, 4);
    }
    
    /**
     *
     */
    @Test
    public void apenasParaAgradarJacocoTool100PorCentoCobertura() {
        new Produto();
    }

   
    
}
