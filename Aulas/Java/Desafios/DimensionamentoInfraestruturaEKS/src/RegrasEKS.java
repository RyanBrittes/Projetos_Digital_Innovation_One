package src;

import java.util.Scanner;

public class RegrasEKS {
    public static void main(String[] args) {
        // Definindo as regras básicas
        double podsPorNode = 10;
        double podsPorServidor = 4;

        // Criando um objeto Scanner para receber as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Recebendo as informações do usuário
        System.out.println("Digite o número total de Pods");
        double numeroTotalPods = scanner.nextDouble();

        // Calcule o número mínimo de nodes necessários
        double numeroMinimoNodes = Math.round(calculoMininoNodes(numeroTotalPods, podsPorNode));

        // Calcule o número mínimo de servidores necessários
        double numeroMinimoServidores = Math.round(calculoMininoServidores(numeroTotalPods, podsPorServidor));

        // Exiba o resultado com as recomendações de quantidades de servidores e nodes.
        if(numeroMinimoNodes <= 1){
            System.out.println("1.Recomendamos usar um unico node");
        } else {
            System.out.println("1.Numero minimo de nodes:" + Math.round(numeroMinimoNodes));
        }
        if(numeroMinimoServidores <= 1){
            System.out.println("2.Recomendamos usar um unico node");
        } else {
            System.out.println("2.Numero minimo de servidores:" + Math.round(numeroMinimoServidores));
        }

        // Fechando o Scanner
        scanner.close();
    }
    //Método para calcular o número mínimo de Servidores
    public static double calculoMininoServidores(double numeroTotalPods, double podsPorServidor){
        double calculoServidores = numeroTotalPods / podsPorServidor;
        return calculoServidores;
    }
    //Método para calcular o número mínimo de Nodes
    public static double calculoMininoNodes(double numeroTotalPods, double podsPorNode){
        double calculoNodes = numeroTotalPods / podsPorNode;
        return calculoNodes;
    }
}
