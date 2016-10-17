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
public class PotenciaTest {

    /**
     *
     */
    @Test(expected = IllegalArgumentException.class)
    public void numInvalido() {

        Potencia.resultado(-1, 4);
    }

    /**
     *
     */
    @Test(expected = IllegalArgumentException.class)
    public void numInvalidoa() {

        Potencia.resultado(4, -4);
    }

    /**
     *
     */
    @Test(expected = IllegalArgumentException.class)
    public void numInvalidob() {

        Potencia.resultado(-4, -4);
    }

    /**
     *
     */
    @Test
    public void numValido() {

        Potencia.resultado(7, 4);
    }

    /**
     *
     */
    @Test
    public void apenasParaAgradarJacocoTool100PorCentoCobertura() {
        Potencia.chamarConstrutor();
    }    

}
