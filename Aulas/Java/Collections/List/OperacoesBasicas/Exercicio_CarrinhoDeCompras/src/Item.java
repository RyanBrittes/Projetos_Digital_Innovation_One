public class Item {
    //Atributos
    public String nome;
    public double preco;
    public int quantidade;

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

    //Contrutor
    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String toString() {
        return "Produto: " + nome + "/ Preço: " + preco + " R$/ Quantidade: " + quantidade + " Unidades \n";
    }
}
