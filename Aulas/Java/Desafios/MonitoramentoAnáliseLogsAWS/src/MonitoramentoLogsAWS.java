package src;

import java.util.*;

public class MonitoramentoLogsAWS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeLogs = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Map<String, Long> eventosPorServico = new HashMap<>();
        for (int i = 0; i < quantidadeLogs; i++) {
            String[] parts = scanner.nextLine().split(",");
            String servico = parts[1];
            // Utilize o mapa para registrar/incrementar o serviço em questão.
            System.out.println(servico);
        }

        // Identifique no mapa os serviços com maior e menor quantidade de logs.
        //      Dica: Utilize Java Streams para tornar essa tarefa mais simples.

        // Imprima a saída no padrão definido no enunciado deste desafio.
        System.out.println("Eventos por servico:");
        System.out.println("Maior:");
        System.out.println("Menor:");
    }
}