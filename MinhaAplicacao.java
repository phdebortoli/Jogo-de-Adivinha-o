import java.util.Scanner;
import java.util.Random;

public class MinhaAplicacao {
    public static void main(String[] args) {
        Scanner lerTeclador = new Scanner(System.in);

        int numeroAleatorio = new Random().nextInt(50);
        int tentativas = 10;

        System.out.println("Você tem 5 tentativas para acertar!");

        //for (int i = 1, j =4; i <= tentativas; i++, j--) {
        for (int i = 1; i <= tentativas; i++) {
            System.out.println("Qual é o número:");
            int numero = lerTeclador.nextInt();

            if (numero < numeroAleatorio) {
                System.out.println("Tente um número maior!");
            } else if (numero > numeroAleatorio) {
                System.out.println("Tente um número menor!");
            } else {
                System.out.println("Você Acertou!");
                System.out.println("Você acertou na " + i);
                break;
            }
            
            System.out.println("Errou! Você tem " + (tentativas - i) + " chances para acertar.");
        }
        System.out.println("Número sorteado: " + numeroAleatorio);
    }
}