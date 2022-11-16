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
        Assertions.assertEquals(0, calculadora.dividir(0,3));
    }

    @Test
    @DisplayName("Divisão de dois Inteiros Por zero")
    public void dividirInteiroPorZero(){
        ArithmeticException exception = Assertions.assertThrows(ArithmeticException.class, () -> {
            calculadora.dividir(5, 0);
        });
        Assertions.assertEquals("Divisão por 0 não é Permitida", exception.getMessage());
    }

    @Test
    @DisplayName("Soma de valores máximos e Minimos")
    public void somarValoreMaximoseMininos(){
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculadora.somar(2147483, -2147483648);
        });
        Assertions.assertEquals("Valor das parcelas maior/menor que o permitido! (MAX = 2147483647 | MIX = -2147483648 )", exception.getMessage());
    }
    @Test
    @DisplayName("Multiplicação de valores máximos e Minimos")
    public void multiplicacaoValoreMaximoseMininos(){
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculadora.somar(2147483, -2147483648);
        });
        Assertions.assertEquals("Valor das parcelas maior/menor que o permitido! (MAX = 2147483647 | MIX = -2147483648 )", exception.getMessage());
    }


}//class
