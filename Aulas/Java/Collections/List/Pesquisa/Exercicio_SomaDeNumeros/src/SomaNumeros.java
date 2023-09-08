import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //Atributo
    private List<ListaNumeros> listaNumeros;

    //Construtor da Classe
    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    //Método responsável por adicionar novos dados
    public void adicionarNumero(int numero){
        listaNumeros.add(new ListaNumeros(numero));
    }

    //Método responsável por calcular a soma dos números
    public int calcularSoma(){
        int somaT = 0;
        if(!listaNumeros.isEmpty()){
            for(ListaNumeros lm : listaNumeros){
                int soma = lm.getNumero();
                somaT += soma;
            }
        }

        return somaT;
    }

    public int encontrarMaiorNumero(){
        int num = 0;
        if(!listaNumeros.isEmpty()){
            for(ListaNumeros m : listaNumeros){
                if (m.getNumero() > num) {
                    num = m.getNumero();
                }
            }
        }
        return num;
    }

    public int encontrarMenorNumero(){
    int num = 0;
    if(!listaNumeros.isEmpty()){
        for(ListaNumeros m : listaNumeros){
            if(num == 0){
                num = m.getNumero();
            }
            if (num > m.getNumero()) {
                num = m.getNumero();
            }
        }
    }
    return num;
}

    public List<ListaNumeros> exibirNumeros(){
        return listaNumeros;
    }

    public static void main(String[] args) {
        //Instância da classe SomaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();

        //Adicionar um item à lista
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(6);
        somaNumeros.adicionarNumero(93);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(8);
        somaNumeros.adicionarNumero(26);
        somaNumeros.adicionarNumero(1);

        //Impressão do cálculo total dos itens da lista
        System.out.println("O valor total da lista é: " + somaNumeros.calcularSoma());

        //Impressão do maior número
        System.out.println("O maior número da lista é: " + somaNumeros.encontrarMaiorNumero());
        
        //Impressão do menos número
        System.out.println("O menor número da lista é: " + somaNumeros.encontrarMenorNumero());

        //Impressão de todos os valores adicionados na lista
        System.out.println("O valores adicionados na lista são: " + somaNumeros.exibirNumeros());

    }


    
}
