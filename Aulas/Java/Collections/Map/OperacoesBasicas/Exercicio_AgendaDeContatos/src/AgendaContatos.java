import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //Atributo
    private Map<String, Integer> agendaContatoMap;

    //Construtor
    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }
    //Método para Adicionar Contato
    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    //Método para Remover Contato
    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    //Método para Exibir Contato
    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    //Método para Pesquisar por Nome
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        //Instanciamento da classe AgendaContatos
        AgendaContatos agendaContatos = new AgendaContatos();

        //Adicionando Contatos
        agendaContatos.adicionarContato("Joaquim", 23649877);
        agendaContatos.adicionarContato("Rafael", 12316498);
        agendaContatos.adicionarContato("James", 269874);
        agendaContatos.adicionarContato("Rafael", 3166998);
        agendaContatos.adicionarContato("Emanoela", 23649877);
        agendaContatos.adicionarContato("Joaquim", 22222364);

        //Exibindo Contatos
        agendaContatos.exibirContato();

        //Removendo Contatos
        agendaContatos.removerContato("Rafael");

        //Exibindo Contatos
        agendaContatos.exibirContato();

        //Pesquisando Contatos pelo Nome
        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Joaquim"));
    }
    
}
