public class Produto {
    //Atributos
    private String nome;
    private double preco;
    private int quantidade;

    //Construtor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    //ToString
    public String toString() {
        return "Nome = " + nome + " /Preco = " + preco + " /Quantidade = " + quantidade + "\n";
    } 
}
