package src;

import java.util.Scanner;

public class CalculandoCustosAWS {
    public static void main(String[] args) {
        // Definindo as taxas
        double custoPorHoraServidor = 0.15;
        double custoPorHoraBancoDados = 0.05;

        // Criando um objeto Scanner para receber as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Recebendo as informações do usuário
        System.out.println("Digite a quantidade de servidores e de banco de dados:");
        int quantidadeServidores = scanner.nextInt();
        int quantidadeBancosDados = scanner.nextInt();
        // Calculo dos custos

        double custoTotal = calculoCustosAWS(quantidadeServidores, quantidadeBancosDados, custoPorHoraServidor, custoPorHoraBancoDados);
        System.out.printf("Custo total de uso da AWS por hora: R$ %.2f%n", custoTotal);

        // Fechando o Scanner
        scanner.close();
    }

    public static double calculoCustosAWS(int quantidadeServidores, int quantidadeBancosDados, double custoPorHoraServidor, double custoPorHoraBancoDados){
        double calculo = (quantidadeServidores * custoPorHoraServidor) + (quantidadeBancosDados * custoPorHoraBancoDados);

        return calculo;
    }
}
