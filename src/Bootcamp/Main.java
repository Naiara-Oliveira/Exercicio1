package Bootcamp;

import Bootcamp.model.Gato;

public class Main {

    public static void main(String[] args) {

        Gato gato = new Gato("Léo", "preto", 11);
        gato.setNome( "Mel" );
        System.out.println(gato);

        Livro livro = new Livro("Olhar do ceu", 230);
        System.out.println(livro);
    }
}
class Livro{
    private String nome;
    private Integer numeroPaginas;

    public Livro(String nome, Integer numeroPaginas) {
        this.nome = nome;
        this.numeroPaginas = numeroPaginas;
    }

    public Livro() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Livro livro = (Livro) o;

        if (nome != null ? !nome.equals( livro.nome ) : livro.nome != null) return false;
        return numeroPaginas != null ? numeroPaginas.equals( livro.numeroPaginas ) : livro.numeroPaginas == null;
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + (numeroPaginas != null ? numeroPaginas.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }
}

