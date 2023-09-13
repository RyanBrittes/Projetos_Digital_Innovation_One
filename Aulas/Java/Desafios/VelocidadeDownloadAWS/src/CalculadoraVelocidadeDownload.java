package src;

import java.util.Scanner;

public class CalculadoraVelocidadeDownload {

    public static void main(String[] args) {
            //Inicializacao do Scanner
            Scanner scanner = new Scanner(System.in);

            // Solicitar a entrada do usuário para a distância física e a velocidade do plano de internet
            System.out.println("Digite dois valores, a distância física e a velocidade do plano de internet");
            double distanciaServidores = scanner.nextDouble();

            double velocidadePlano = scanner.nextDouble();

            // Calcule a velocidade de download estimada
            double velocidadeDownloadEstimada = calcularVelocidadeDownload(distanciaServidores, velocidadePlano);

            // Apresentar o resultado
            System.out.println("\nVelocidade de Download Estimada: " + String.format("%.2f", velocidadeDownloadEstimada) + " Mbps");

            scanner.close();
        }
        public static double calcularVelocidadeDownload(double distanciaServidores, double velocidadePlano) {
            
            //Calculo para se obter o valor da velocidade de internet
            double vd = velocidadePlano / (1 + (distanciaServidores/100));
            
            //Retorno do Calculo
            return vd;

        }
    }