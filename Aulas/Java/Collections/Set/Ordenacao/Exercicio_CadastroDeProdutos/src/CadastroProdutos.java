import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //Atributo
    private Set<Produto> produtoSet;

    //Construtor
    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }
    
    //Método para adicionar produto
    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto (codigo, nome, preco, quantidade));
    }

    //Método para exibir o conjunto por nome
    public Set<Produto> exibirPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    //Método para exibir o conjunto por preço
    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;        
    }

    public static void main(String[] args) {
        //Instanciamento da Classe CadastroProduto
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        
        //Adicionando produtos
        cadastroProdutos.adicionarProduto(26, "Fita Crepe", 2.60, 1);
        cadastroProdutos.adicionarProduto(06, "Cano PVC", 4.30, 2);
        cadastroProdutos.adicionarProduto(02, "Martelo Pequeno", 10, 3);
        cadastroProdutos.adicionarProduto(02, "Forro PVC", 3.20, 10);
        cadastroProdutos.adicionarProduto(10, "Bucha 10", 0.3, 20);

        //Exibindo produtos
        System.out.println(cadastroProdutos.produtoSet);

        //Exibindo conjunto por nome
        System.out.println(cadastroProdutos.exibirPorNome());

        //Exibindo conjunto por preço
        System.out.println(cadastroProdutos.exibirPorPreco());
    }
}
