import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //Atributos
    private Map<Long, Produto> estoqueProdutosMap;

    //Construtor
    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    //Método para adicionar produtos
    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    //Método para exibir todos os produtos
    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    //Método para Calcular o valor total do estoque
    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    //Método para Obter o Produto mais Caro
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }

        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        //Instanciando a classe EstoqueProdutos
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        //Adicionando um novo produto
        estoqueProdutos.adicionarProduto(3, "Mouse", 20, 89.9);
        estoqueProdutos.adicionarProduto(2, "Teclado", 16, 60.9);
        estoqueProdutos.adicionarProduto(16, "Monitor  ", 12, 1326.9);
        estoqueProdutos.adicionarProduto(14, "Gabinete ", 30, 230);
        estoqueProdutos.adicionarProduto(3, "Heatset", 60, 130.9);
        estoqueProdutos.adicionarProduto(7, "Mouse", 26, 102.9);
        estoqueProdutos.adicionarProduto(9, "Hub", 16, 103.9);

        //Exibindo Produtos
        estoqueProdutos.exibirProdutos();

        //Calculando o valor total do estoque
        System.out.println("O valor total do estoque é: " + estoqueProdutos.calcularValorTotalEstoque());

        //Obtendo o produto mais caro
        System.out.println("O produto mais caro é: " + estoqueProdutos.obterProdutoMaisCaro());

    }

}
