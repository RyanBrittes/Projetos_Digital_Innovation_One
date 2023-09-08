import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //Atributo
    private List<Livro> livroList;

    //Construtor da Classe CatalogoLivros
    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }
    
    //Método responsável por Adicionar novos livros
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    //Método responsável por Pesquisar por Autor
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    //Método responsável por Pesquisar por Intervalo de Anos
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }
    //Método responsável por Pesquisar por Titulo    
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        //Instanciando a classe CatalogoLivros
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        //Adicionando dados aos atributos
        catalogoLivros.adicionarLivro("O Poder do Hábito", "Joao de Souza", 2006);
        catalogoLivros.adicionarLivro("O Poder do Hábito", "Rafael Duarte", 2009);
        catalogoLivros.adicionarLivro("O lado bom do lado ruim", "Rafael Duarte", 2010);
        catalogoLivros.adicionarLivro("Homem de Giz", "Steve Mendonça", 2014);
        catalogoLivros.adicionarLivro("O lado bom do lado ruim", "Steve Mendonça", 2006);

        //Impressão da pesquisa por Autor
        System.out.println(catalogoLivros.pesquisarPorAutor("Joao de Souza"));

        //Impressão da Pesquisa por Intervalo de Ano
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2000, 2006));

        //Impressão das Pesquisa por Titulo
        System.out.println(catalogoLivros.pesquisarPorTitulo("O lado bom do lado ruim"));
    }
}
