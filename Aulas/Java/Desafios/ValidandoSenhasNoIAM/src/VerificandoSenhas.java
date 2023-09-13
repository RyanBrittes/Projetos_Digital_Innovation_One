package src;
import java.util.Scanner;
import java.util.regex.Pattern;

public class VerificandoSenhas {
        public static void main(String[] args) {

            //Inicialização do Scanner, para gravar uma entrada
            Scanner scanner = new Scanner(System.in);
        
            //Print da mensagem na tela para requisitar a senha
            System.out.println("Digite a senha para verificar a força:");

            //Atribuição da entrada a uma variavel
            String senha = scanner.nextLine();

            //Finalização do Scanner
            scanner.close();

            //Atribuião do retorno da verificacao da senha para a variavel resultado
            String resultado = verificarForcaSenha(senha);

            //Print do resultado da verificacao da senha
            System.out.println(resultado);
        }
        public static String verificarForcaSenha(String senha) {
            //Variável responsável por receber o valor do teste
            String teste = "";

            //Comprimento mínimo da senha
            int comprimentoMinimo = 8;

            // Critérios de validação usando expressões regulares
            boolean temLetraMaiuscula = Pattern.compile("[A-Z]").matcher(senha).find();
            boolean temLetraMinuscula = Pattern.compile("[a-z]").matcher(senha).find();
            boolean temNumero = Pattern.compile("\\d").matcher(senha).find();
            boolean temCaractereEspecial = Pattern.compile("\\W").matcher(senha).find();
            boolean temSequenciaComum = senha.matches(".*(?i)123456.*|.*(?i)abcdef.*");
            boolean temPalavraComum = senha.equalsIgnoreCase("password") || senha.equalsIgnoreCase("123456") || senha.equalsIgnoreCase("qwerty");

            if(senha.length() >= comprimentoMinimo){
                if(temLetraMaiuscula == true && temLetraMinuscula == true && temNumero == true && temCaractereEspecial == true && temSequenciaComum == false && temPalavraComum == false){
                    teste = "Sua senha atende aos requisitos de seguranca. Parabens!";
                } else {
                    teste = "Sua senha nao atende aos requisitos de seguranca.";
                }
            } else {
                teste = "Sua senha e muito curta. Recomenda-se no minimo 8 caracteres.";
            }
            
            return teste;
        }
}