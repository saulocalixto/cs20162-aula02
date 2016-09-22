/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.java.com.github.saulocalixto.exercicios;

import main.java.com.github.saulocalixto.exercicios.somNumnat;
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
public class somNumnatTest {
    
    @Test(expected = IllegalArgumentException.class)
    public void numInvalido() {
        
        somNumnat.somNume(-1);
    }
    @Test
    public void numValido() {
        
        somNumnat.somNume(5);
    }
    
    @Test
    public void apenasParaAgradarJacocoTool100PorCentoCobertura() {
        new somNumnat();
    }

   
    
}
