import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    //Atributo
    private List<ListaNumeros> listaNumeros;

    //Construtor
    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    //Metodo par adicionar itens na lista
    public void adicionarNumero(int numero){
        listaNumeros.add(new ListaNumeros(numero));
    }

    //Metodo para ordenar de forma Ascendente
    public List<ListaNumeros> ordenarAscendente(){
        List<ListaNumeros> ordemAscendente = new ArrayList<>(listaNumeros);
        Collections.sort(ordemAscendente);
        return ordemAscendente;
    }

    //Metodo para ordenar de forma Descendente
    public List<ListaNumeros> ordenarDescendente(){
        List<ListaNumeros> ordemDescendente = new ArrayList<>(listaNumeros);
        ordemDescendente.sort(Collections.reverseOrder());
        return ordemDescendente;
    }

    public static void main(String[] args) {
        //Instanciando a classe OrdenacaoNumeros
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        //Adicionando números na lista
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(16);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(26);
        ordenacaoNumeros.adicionarNumero(90);

        //Exibindo a lista em ordem Ascendente
        System.out.println("Ordem Ascendente --> " + ordenacaoNumeros.ordenarAscendente());

        //Exibindo a lista em ordem Descendente
        System.out.println("Ordem Descendente --> " + ordenacaoNumeros.ordenarDescendente());
        
    }
}
