package Bootcamp.Exercicios1;

public class Calculadora2_0 {
    public static void main(String[] args) {

        somarValor( 9,4 );
        subitrairValor( 10,2 );
        multiplicarValor( 10,2 );
        dividirValor( 10, 2 );
    }

    public static void  somarValor(double a, double b) {
        double soma = a + b;
        System.out.println("A soma de " + a +" mais " + b +" = " + soma );

    }

    public static void subitrairValor(double a, double b) {
        double subtrair = a - b;
        System.out.println("A subtração de " + a +" menos " + b +" = " + subtrair );

    }

    public static void multiplicarValor(double a, double b) {
        double multiplicar = a * b;
        System.out.println("A multiplicação de "  + a +" vezes " + b +" = "  + multiplicar );

    }

    public static void dividirValor(double a, double b) {
        double dividir = a / b;
        System.out.println("A divisão de " + a +" dividido " + b +" = "  + dividir);

    }

}

