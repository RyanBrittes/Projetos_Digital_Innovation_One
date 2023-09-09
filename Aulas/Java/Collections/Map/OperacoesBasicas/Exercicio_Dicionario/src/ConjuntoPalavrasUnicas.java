import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //Atributo
    private Set<Palavra> listaPalavra;

    //Construtor
    public ConjuntoPalavrasUnicas() {
        this.listaPalavra = new HashSet<>();
    }

    //Método para adicionar uma palavra
    public void adicionarPalavra(String palavras){
        listaPalavra.add(new Palavra(palavras));
    }

    //Método para remover palavra
    public void removerPalavra(String palavras){
        Palavra removerPalavra = null;
        if(!listaPalavra.isEmpty()){
            for(Palavra p : listaPalavra){
                if(p.getPalavras() == palavras){
                    removerPalavra = p;
                    break;
                }
            }
            listaPalavra.remove(removerPalavra);
        } else {
            System.out.println("A lista está vazia.");
        }
    }

    //Método para verificar se uma palavra existe na lista
    public void verificarPalavra(String palavra){
        int cont = 0;
        if(!listaPalavra.isEmpty()){
            for(Palavra p : listaPalavra){
                if(p.getPalavras() == palavra){
                    cont++;
                    break;
                }
            }
            if(cont > 0){
                System.out.println("Palavra encontrada, ela existe no conjunto.");
            } else {
                System.out.println("Palavra não encontrada, ela não existe no conjunto.");
            }
        } else {
            System.out.println("A lista está vazia.");
        }
    }

    //Método para exibir todas as palavras
    public void exibirPalavrasUnicas(){
        if(!listaPalavra.isEmpty()){
        System.out.println(listaPalavra);
        } else {
            System.out.println("Lista Vazia");
        }   
    }

    public static void main(String[] args) {
        //Instanciamento da classe ConjuntoPalavrasUnicas
        ConjuntoPalavrasUnicas conjuntoPalavras = new ConjuntoPalavrasUnicas();

        //Adicionando palavras
        conjuntoPalavras.adicionarPalavra("Amoeba");
        conjuntoPalavras.adicionarPalavra("Money");
        conjuntoPalavras.adicionarPalavra("Celular");
        conjuntoPalavras.adicionarPalavra("Celular");

        //Exibindo o conjunto de palavras
        conjuntoPalavras.exibirPalavrasUnicas();

        //Verificando se a palavra digitada existe no conjunto
        conjuntoPalavras.verificarPalavra("Amoeba");
    }
}