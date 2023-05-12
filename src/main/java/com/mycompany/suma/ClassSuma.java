package com.mycompany.suma;

/**
 *
 * @author Jaavii
 */
public class ClassSuma {
    
    private int num1;
    private int num2;

    public ClassSuma(int num1,int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public int sumar (int num1, int num2) {
        return num1 + num2;
    }
    
    public int getNum1() {
        return num1;
    }
    
    public int sumaValorAbsolut () {
        num1 = Math.abs(-2);
        int numFinal = num1 + 3;
        return numFinal;
    }
}
