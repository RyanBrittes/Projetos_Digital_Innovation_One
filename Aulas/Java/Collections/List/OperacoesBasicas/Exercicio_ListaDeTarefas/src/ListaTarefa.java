import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //Atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        if(!tarefaList.isEmpty()){
            for(Tarefa t: tarefaList){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefasParaRemover.add(t);
                }   
            }
        tarefaList.removeAll(tarefasParaRemover);
        } else{
        System.out.println("A lista está vazia!");
        }
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        if(!tarefaList.isEmpty()){
            System.out.println(tarefaList);
        }else {
            System.out.println("A lista está vazia");
        }
    }

    public static void main(String[] args) {
        //Criando uma instância da classe ListaTarefa
        ListaTarefa listaTarefa = new ListaTarefa();

        //Teste Adicionando Tarefas
        listaTarefa.adicionarTarefa("Abastecer a moto");
        listaTarefa.adicionarTarefa("Fazer atividade da faculdade");
        listaTarefa.adicionarTarefa("Lavar a louça");
        System.out.println("O número total de elementos na lista é " + listaTarefa.obterNumeroTotalTarefas());  
        
        //Teste removendo tarefas
        listaTarefa.removerTarefa("Lavar a louça");
        System.out.println("O número total de elementos na lista é " + listaTarefa.obterNumeroTotalTarefas());  
        
        //Teste exibindo as descrições das tarefas
        listaTarefa.obterDescricoesTarefas(); 

    }
}