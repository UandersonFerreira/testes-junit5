package com.uanderson;


public class Calculadora {
    int max_int = Integer.MAX_VALUE;
    int min_int = Integer.MIN_VALUE;
    //int n = 2147483649; parametiza test

    public int somar(int parcela1, int parcela2){
        valorLimiteInteiros(parcela1, parcela2);
        return parcela1 + parcela2;
    }

    private void valorLimiteInteiros(int parcela1, int parcela2) {
        if (parcela1 >= max_int || parcela1 <= min_int || parcela2 >= max_int || parcela2 <= min_int){
            throw new IllegalArgumentException("Valor das parcelas maior/menor que o permitido! (MAX = 2147483647 | MIX = -2147483648 )");
        }
    }

    public int subtrair(int parcela1, int parcela2){
        return parcela1 - parcela2;
    }

    public int multiplicar(int parcela1, int parcela2){
        valorLimiteInteiros(parcela1, parcela2);
        return parcela1 * parcela2;
    }

    public int dividir(int dividendo, int divisor){
        if (divisor == 0){//não é permitido somente quando o divisor é zero
            throw new ArithmeticException("Divisão por 0 não é Permitida");
        }
        return dividendo/divisor;
    }

    public static void main(String[] args) {
        Calculadora c = new Calculadora();

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println( c.somar(2147483647,5));

    }
}//class

/*
 if (parcela1 == 0 || parcela2 == 0){
            throw new ArithmeticException("Divisão por 0 não é Permitida");
        }
 */
