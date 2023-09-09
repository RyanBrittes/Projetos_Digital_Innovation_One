import java.util.Comparator;

public class Produto implements Comparable<Produto>{
    //Atributo
    private long codigo;
    private String nome;
    private double preco;
    private int quantidade;

    //Construtor
    public Produto(long codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    //Getters
    public long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    //Equals and HashCode
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (codigo ^ (codigo >>> 32));
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (codigo != other.codigo)
            return false;
        return true;
    }

    //ToString
    public String toString() {
        return "Codigo = " + codigo + " /Nome = " + nome + " /Preco = " + preco + " /Quantidade = " + quantidade + "\n";
    }

}

class ComparatorPorPreco implements Comparator<Produto>{
    
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }

}