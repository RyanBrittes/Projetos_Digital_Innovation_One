import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //Atributo
    private Set<Convidado> convidadoSet;

    //Construtor
    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    //Metodo para Adicionar convidado
    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    //Metodo para Remover convidado
    public void removerConvidadoPorConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        if(!convidadoSet.isEmpty()){
            for(Convidado c : convidadoSet){
                if(c.getCodigoConvite() == codigoConvite){
                    convidadoParaRemover = c;
                    break;
                }
            }
            convidadoSet.remove(convidadoParaRemover);
        } else {
            System.out.println("Convidado não encontrado.");
        }
    }
    //Metodo para exibir a quantidade de convidados
    public int contarConvidados(){
        return convidadoSet.size();
    }
    //Metodo para exibir o nome e condigo do convidado
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        //Estanciamento da classe ConjuntoConvidados
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        //Adicionando Convidados
        conjuntoConvidados.adicionarConvidado("Raul", 1);
        conjuntoConvidados.adicionarConvidado("Debora", 2);
        conjuntoConvidados.adicionarConvidado("Joana", 9);
        conjuntoConvidados.adicionarConvidado("Cirilo", 9);
        conjuntoConvidados.adicionarConvidado("Joao", 16);
        conjuntoConvidados.adicionarConvidado("Rafael", 10);
        conjuntoConvidados.adicionarConvidado("Joao", 4);

        //Exibindo Convidados antes de remover
        System.out.println("Antes de remover: ");
        System.out.println("Quantidade de convidados --> " + conjuntoConvidados.contarConvidados());
        conjuntoConvidados.exibirConvidados();
        

        //Removendo Convidados
        conjuntoConvidados.removerConvidadoPorConvite(4);

        //Exibindo Convidados depois de remover
        System.out.println("Após remover: ");
        System.out.println("Quantidade de convidados --> " + conjuntoConvidados.contarConvidados());
        conjuntoConvidados.exibirConvidados();
    }
}
