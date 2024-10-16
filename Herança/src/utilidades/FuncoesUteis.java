package utilidades; // package utilidades como foi pedido no exercicio

import java.nio.file.Files; // importações para poder ler arquivos
import java.nio.file.Paths;
import java.io.IOException; 
import java.util.List; 

// classe FuncoesUteis para criar os metodos que vão fazer as contas
public class FuncoesUteis {

    // Método para fazer soma
    public static int Soma(int a, int b) {
        int soma = a + b; // Calcula a soma de a e b
        return soma; // Retorna a soma
    }

    // Método para criar um triângulo
    public static void Triangulo(int altura) {
        for (int i = 1; i <= altura; i++) { // For para a altura
            // for para o comprimento das linhas
            for (int j = 1; j <= i; j++) {
                System.out.print("x"); // Coloca os X para formar o triangulo sem pular linha
            }
            // pula para a proxima linha depois do for
            System.out.println();
        }
    }

    // Método para ler arquivo
    public static void printArquivo(String arquivo) {
        try {
            // Lê todas as linhas do arquivo e coloca na lista de strings
            List<String> linhas = Files.readAllLines(Paths.get(arquivo));

            // Escreve cada linha do arquivo no console
            for (String linha : linhas) {
                System.out.println(linha); // Escreve a linha
            }
        } catch (IOException erro) { // Para exceções de entrada e saida
            // se tiver um erro, informa o erro
            System.out.println("Erro ao ler o arquivo: " + erro.getMessage());
        }
    }
}
