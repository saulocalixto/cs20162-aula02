/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.saulocalixto.exercicios;

import org.junit.Test;

/**
 *
 * @author saulocalixto
 */
public class Pro153Test {
    
    /**
     *
     */
    @Test(expected = IllegalArgumentException.class)
    public void numInvalido() {
        
        Pro153.resultado(-5);
    }

    /**
     *
     */
    @Test(expected = IllegalArgumentException.class)
    public void numInvalido1() {
        
        Pro153.resultado(10500);
    }

    /**
     *
     */
    @Test
    public void numValidoF() {
        
        Pro153.resultado(500);
    }
    
    @Test
    public void numValidoV() {
        
        Pro153.resultado(153);
    }
    
    /**
     *
     */
    @Test
    public void apenasParaAgradarJacocoTool100PorCentoCobertura() {
        Pro153.chamarConstrutor();
    }   

}
