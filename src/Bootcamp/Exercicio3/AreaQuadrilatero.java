package Bootcamp.Exercicio3;

public class AreaQuadrilatero {

        public static void main(String[] args) {
            System.out.println("Area do quadrado " +  area( 3));
            System.out.println("Área do triangulo " + area( 5,5));
            System.out.println("Área do trapezio " +  area( 7,8,9 ));
            System.out.println("Área do losango " +  area( 5,2));

        }

        public static double area(double lado){

            return lado * lado ;
        }
        public  static  double area(double lado1, double lado2){
            return  lado1 * lado2 ;
        }
        public static double area(double baseMaior, double baseMenor, double altura){
           return (baseMaior + baseMenor) * altura / 2 ;
        }
        public static double area(float diagonal1, float diagonal2){
        return (diagonal1 * diagonal2) / 2 ;
        }


    }
