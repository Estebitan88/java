package com.krakedev.ejemplojunit;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testSumar() {
    	Calculadora c= new Calculadora();
    	int resultado=c.sumar(5, 10);
        assertTrue(resultado==15);
    }
    //Convierte este metodo en un test de junit
    @Test
    public void testRestar() {
    	Calculadora c= new Calculadora();
    	int resultado=c.restar(10, 2);
        assertTrue(resultado==8);
        //valida que la condicion que esta en el parentesis 
        //sea verdadera, si es así el testRestar es exitoso
        // caso contrario incorrecto
    }

}
