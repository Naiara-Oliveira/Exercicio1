package Bootcamp.Exercicios1;

public class Emprestimos {
    public static void main(String[] args) {

        System.out.println(calcularTaxaParcelas( 120, 3 ));


    };

    public static int getDuasParcelas() {
        return 2;
    }

    public static int getTresParcelas() {
        return 3;
    }

    public static double getTaxaDuasParcelas() {
        return 0.3;
    }
    public static double getTaxaTresParcelas() {
        return 0.45;
    }
    public  static double calcularTaxaParcelas(double valor, int parcelas){

        if (parcelas == 2){

            double valorFinal = valor + (valor * getTaxaDuasParcelas());
            double taxaPagar = valorFinal - valor;
            System.out.println("Valor do emprestimo " + valor);
            System.out.println("Valor final para as duas parcelas: R$ " + valorFinal);
            System.out.println("O valor da taxa é de: " + taxaPagar);
        }
        else if (parcelas == 3) {
            double valorFinal = valor + (valor * getTaxaTresParcelas());
            double taxaPagar = valorFinal - valor;
            System.out.println("Valor do emprestimo " + valor);
            System.out.println("Valor final para as tres parcelas: R$ " + valorFinal);
            System.out.println("O valor da taxa é de: " + taxaPagar);
        }else{
            System.out.println("Quantidades de parcelas não aceitas");
        }
        return valor;
    }
}
