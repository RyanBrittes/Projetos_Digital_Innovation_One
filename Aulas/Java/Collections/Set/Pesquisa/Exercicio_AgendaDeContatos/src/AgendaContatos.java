import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //Atributos
    private Set<Contato> contatoSet;

    //Construtor
    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }
    
    //Método para adicionar novos contatos
    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    //Método para exibir os contatos
    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    //Método para Pesquisar por nome
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    //Método para atualizar o número de contato
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        //Instanciamento da classe AgendaContatos
         AgendaContatos agendaContatos = new AgendaContatos();

         //Adicionando Contatos
         agendaContatos.adicionarContato("Mariana da Silva", 9874613);
         agendaContatos.adicionarContato("Rafael da Silva", 236488);
         agendaContatos.adicionarContato("David da Cruz", 236488);
         agendaContatos.adicionarContato("Stefani Beatriz", 3269874);
         agendaContatos.adicionarContato("Mariana da Silva", 32649877);
         
        //Exibir contatos
        agendaContatos.exibirContatos();

        //Pesquisar por Nome
        System.out.println(agendaContatos.pesquisarPorNome("Stefani"));

        //Atualizar Contatos
        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Mariana da Silva", 26988874));
        
        //Exibir contatos
        agendaContatos.exibirContatos();

    }
}
