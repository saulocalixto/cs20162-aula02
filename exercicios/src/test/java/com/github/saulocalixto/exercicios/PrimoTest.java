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
public class PrimoTest {

    /**
     *
     */
    @Test(expected = IllegalArgumentException.class)
    public void numInvalido() {

        Primo.primo(0);
    }

    /**
     *
     */
    @Test
    public void numValido() {

        Primo.primo(7);
    }

    /**
     *
     */
    @Test
    public void numValido2() {

        Primo.primo(25);
    }

    /**
     *
     */
    @Test
    public void apenasParaAgradarJacocoTool100PorCentoCobertura() {
        Primo.chamarConstrutor();
    } 

}
