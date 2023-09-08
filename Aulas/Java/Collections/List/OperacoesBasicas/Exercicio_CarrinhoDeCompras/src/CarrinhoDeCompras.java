import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //Atributo
    private List<Item> carrinhoCompras;

    public CarrinhoDeCompras(){
        this.carrinhoCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemsParaRemover = new ArrayList<>();
        if(!carrinhoCompras.isEmpty()){
            for(Item i: carrinhoCompras){
                if(i.getNome().equalsIgnoreCase(nome)){
                    itemsParaRemover.add(i);
                }
            }
            carrinhoCompras.removeAll(itemsParaRemover);
        } else {
            System.out.println("O carrinho está vazio");
        }
    }

    public double calcularValorTotal(){
        double calct = 0;
        for (Item c: carrinhoCompras){
            double calc = c.getPreco() * c.getQuantidade();
            calct += calc;
        }

        return calct;
    }

    public void exibirItens(){
        if(!carrinhoCompras.isEmpty()){
            System.out.println(carrinhoCompras);
        } else {
            System.out.println("Não existem items");
        }
    }

    public static void main(String[] args) {
        //Instância da classe
        CarrinhoDeCompras carrinhocompras = new CarrinhoDeCompras();

        //Adicionar items ao carrinho
        carrinhocompras.adicionarItem("Beterraba", 2, 1);
        carrinhocompras.adicionarItem("Pao", 9.5, 2);
        carrinhocompras.adicionarItem("Feijao", 7, 1);

        //Remove items do carrinho
        carrinhocompras.removerItem("Pao");

        //Exibir todos os items
        carrinhocompras.exibirItens();

        //Exibir o valor total da compra
        System.out.println("O valor total da compra é: " + carrinhocompras.calcularValorTotal());
    }
}
