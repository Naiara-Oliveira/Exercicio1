package Bootcamp.Exercicio2;

public class Quadrilatero {
    public static void main(String[] args) {
        area( 3);
area( 5d,5d );
area( 7,8,9 );
area( 5f,2f);
    }

    public static void area(double lado){
        System.out.println("Area do quadrado " + lado * lado);
    }
    public  static  void area(double lado1, double lado2){
        System.out.println("Área do triangulo " + lado1 * lado2);
    }
    public static void area(double baseMaior, double baseMenor, double altura){
        System.out.println("Área do trapezio " + ((baseMaior + baseMenor) * altura) / 2);
    }
    public static void area(float diagonal1, float diagonal2){
        System.out.println("Área do losango " + (diagonal1 * diagonal2) / 2);
    }


}
