package main; // pacote main como foi pedido
import utilidades.FuncoesUteis; // Importa a classe FuncoesUteis do pacote utilidades

// classe main para formatar o resultado final
public class Main {
    public static void main(String[] args) {
        // Chama o método Soma da classe FuncoesUteis e da valor para as variaveis
        int resultadoSoma = FuncoesUteis.Soma(3, 5); 
        // Formata o resultado final
        System.out.println("O resultado da soma é: " + resultadoSoma); 

        // Formata o resultado final do triangulo
        System.out.println("\nTriangulo: ");
        // Chama o método do triângulo e da valor a variavel para montar o triângulo
        FuncoesUteis.Triangulo(5); 

        // FOrmata o resultado final do arquivo
        System.out.println("\nConteúdo do arquivo:");
        // Chama o método do Arquivo e mostra no resultado final a leitura do arquivo escolhido
        FuncoesUteis.printArquivo("C:\\Users\\pc\\Desktop\\AC2\\dieta.txt"); 
    }
}
