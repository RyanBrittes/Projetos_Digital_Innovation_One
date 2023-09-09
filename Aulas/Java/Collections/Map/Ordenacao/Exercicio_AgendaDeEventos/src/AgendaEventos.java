import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    //Atributos
    private Map<LocalDate, Evento> eventosMap;

    //Construtor
    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    //Método para Adicionar Eventos
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    //Método exibir os elementos em ordem crescente
    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    //Método para obter o próximo evento da lista
    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        for(Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()){
            LocalDate dataEvento = entry.getKey();
            if(dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)){
                proximaData = dataEvento;
                proximoEvento = entry.getValue();
                break;
            }
        }
        if (proximoEvento != null){
            System.out.println("O proximo evento: " + proximoEvento.getNome() + " acontecerá na data " + proximaData);
        } else {
            System.out.println("Não há eventos futuros na agenda");
        }
    }

    public static void main(String[] args) {
        //Instanciando a classe AgemdaEventos
        AgendaEventos agendaEventos = new AgendaEventos();
        
        //Adicionando Eventos na Lista
        agendaEventos.adicionarEvento(LocalDate.of(2022, 6, 15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 7, 6), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 10, 10), "Evento 3", "Atração 3");

        //Exibindo todos os Eventos
        agendaEventos.exibirAgenda();

        //Exibindo o próximo evento da lista
        agendaEventos.obterProximoEvento();
        
    }



}
