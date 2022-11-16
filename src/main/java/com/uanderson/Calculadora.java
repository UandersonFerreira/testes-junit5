package com.uanderson;

import java.util.IllegalFormatCodePointException;

public class Calculadora {
    int max_int = Integer.MAX_VALUE;
    int min_int = Integer.MIN_VALUE;
    //int n = 2147483649; parametiza test

    public int somar(int valor1, int valor2){
        if (valor1 >= max_int || valor1 <= min_int || valor2 >= max_int || valor2 <= min_int){
            throw new IllegalArgumentException("Valor das parcelas maior que o permitido!");
        }
        return valor1 + valor2;
    }

    public int subtrair(int valor1, int valor2){
        return valor1 - valor2;
    }

    public int multiplicar(int valor1, int valor2){
        return valor1 * valor2;
    }

    public int dividir(int valor1, int valor2){
        if (valor1 == 0 || valor2 == 0){
            throw new ArithmeticException("Divisão por 0 não é Permitida");
        }
        return valor1 / valor2;
    }

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
       // System.out.println( c.dividir(0,0));

        System.out.println(Integer.MAX_VALUE);


    }
}//class

/*
 if (valor1 == 0 || valor2 == 0){
            throw new ArithmeticException("Divisão por 0 não é Permitida");
        }
 */
