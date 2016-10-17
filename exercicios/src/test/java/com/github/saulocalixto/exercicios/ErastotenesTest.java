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

        Erastotenes.obterPrimo(-1, arrayNormal);
    }

    /**
     *
     */
    @Test
    public void numPrimo() {
        
        Erastotenes.obterPrimo(7,arrayNormal);
    }
    
    @Test
    public void numNaoPrimo() {
        
        Erastotenes.obterPrimo(6,arrayNormal);
    }
    @Test
    public void arrayZero() {
        
        Erastotenes.obterPrimo(6,array);
    }
    
    @Test
    public void arrayZeroV() {
        
        Erastotenes.obterPrimo(7,array);
    }
    
    @Test
    public void arrayNaozero() {
        
        Erastotenes.obterPrimo(6,arrayNotzero);
    }
    
     @Test
    public void arrayNaozeroV() {
        
        Erastotenes.obterPrimo(7,arrayNotzero);
    }
    
    /**
     *
     */
    @Test
    public void apenasParaAgradarJacocoTool100PorCentoCobertura() {
        Erastotenes.chamarConstrutor();
    }    
}
