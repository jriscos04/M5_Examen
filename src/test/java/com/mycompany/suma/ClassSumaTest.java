package com.mycompany.suma;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jaavii
 */
public class ClassSumaTest {
    ClassSuma checker = new ClassSuma(0,0);
    
     @Test
    public void testSumar() {
        int resultado = checker.sumar(3,4);
        assertEquals(7,resultado);
    }

    @Test
    public void testGetNum1() {
        int num1 = checker.getNum1();
        assertEquals(0, num1);
    }

    @Test
    public void testSumaValorAbsoluto() {
        int numFinal = checker.sumaValorAbsolut();
        assertEquals(5, numFinal);
    }
}








        
    }
    

