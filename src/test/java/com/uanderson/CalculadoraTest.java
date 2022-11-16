package com.uanderson;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class CalculadoraTest {
    Calculadora calculadora = new Calculadora();

    @Test
    @DisplayName("Soma de dois Inteiros")
    public void somarInteiros(){
        Assertions.assertEquals(2, calculadora.somar(1,1));
    }
  @Test
    @DisplayName("Subtração de dois Inteiros")
    public void subtrairInteiros(){
        Assertions.assertEquals(2, calculadora.subtrair(4,2));
    }
  @Test
    @DisplayName("Multiplicação de dois Inteiros")
    public void multiplicarInteiros(){
        Assertions.assertEquals(4, calculadora.multiplicar(2,2));
    }

    @Test
    @DisplayName("Divisão de dois Inteiros")
    public void dividirInteiros(){
        Assertions.assertEquals(2, calculadora.dividir(6,3));
    }

    @Test
    @DisplayName("Divisão de dois Inteiros")
    public void dividirInteiroPorZero(){
        ArithmeticException exception = Assertions.assertThrows(ArithmeticException.class, () -> {
            calculadora.dividir(5, 0);
        });
        Assertions.assertEquals("Divisão por 0 não é Permitida", exception.getMessage());
    }


}//class
