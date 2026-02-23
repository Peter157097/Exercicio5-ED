import java.util.Scanner;
import controller.SerieHarmonica;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = entrada.nextInt();

        if (numero <= 0) {
            System.out.println("O valor deve ser maior que zero.");
        } else {

            // Criando objeto da classe recursiva
            SerieHarmonica calculo = new SerieHarmonica();

            double soma = calculo.calcularSomatoria(numero);

            System.out.println("Valor da série harmônica até " + numero + ": " + soma);
        }

        entrada.close();
    }
}