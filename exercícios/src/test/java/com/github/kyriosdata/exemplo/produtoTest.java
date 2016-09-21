package com.github.kyriosdata.exemplo;

import main.java.com.github.kyriosdata.exemplo.produto;
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
public class produtoTest {
    
    @Test(expected = IllegalArgumentException.class)
    public void numInvalidoa() {

        produto.resultado(-1, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void numInvalidob() {

        produto.resultado(1, -4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void numInvalidoab() {

        produto.resultado(-1, -4);
    }
    @Test
    public void numValido() {
        
        produto.resultado(1, 4);
    }
    
    @Test
    public void apenasParaAgradarJacocoTool100PorCentoCobertura() {
        new produto();
    }

   
    
}
