package com.mycompany.suma;

/**
 *
 * @author Jaavii
 */
public class ClassSuma {
    
    private int num1;

    public ClassSuma(int num1) {
        this.num1 = num1;
    }
    
    public int sumaValorAbsolut () {
        num1 = Math.abs(-2);
        int numFinal = num1 + 3;
        return numFinal;
    }
}
