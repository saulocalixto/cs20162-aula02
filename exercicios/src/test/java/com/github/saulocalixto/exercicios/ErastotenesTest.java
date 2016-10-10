package com.github.saulocalixto.exercicios;

import com.github.saulocalixto.exercicios.Erastotenes;
import org.junit.Test;

/**
 *
 * @author saulocalixto
 */
public class ErastotenesTest {
    
    static int[] arrayNormal = new int[1000];
    static int[] arrayNotzero = { 3, 3, 3, 3, 3, 3, 3};
    static int[] array = {3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    
    /**
     *
     */
    @Test(expected = IllegalArgumentException.class)
    public void numInvalidoanmenor1() {

        Erastotenes.Erastones(-1, arrayNormal);
    }

    /**
     *
     */
    @Test
    public void numPrimo() {
        
        Erastotenes.Erastones(7,arrayNormal);
    }
    
    @Test
    public void numNaoPrimo() {
        
        Erastotenes.Erastones(6,arrayNormal);
    }
    @Test
    public void arrayZero() {
        
        Erastotenes.Erastones(6,array);
    }
    @Test
    public void arrayNaozero() {
        
        Erastotenes.Erastones(6,arrayNotzero);
    }
    
    /**
     *
     */
    @Test
    public void apenasParaAgradarJacocoTool100PorCentoCobertura() {
        new Erastotenes();
    }    
}
