import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final Random numeroAdivinhar = new Random();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        boolean venceu;
        do {
            int numeroSortado = numeroSorteado();
            do {
                venceu = verificacaoAcerto(menu(), numeroSortado);
            } while (!venceu);
            System.out.println("Deseja jogar novamente?\n0 - não \nelse - sim");
            opcao = sc.nextInt();
        } while (opcao != 0);
    }

    public static int menu() {
        System.out.print("Digite um numero entre 0 - 100 : ");
        return sc.nextInt();
    }

    public static int numeroSorteado() {
        return numeroAdivinhar.nextInt(1000);
    }

    public static boolean verificacaoAcerto(int numeroDigitado, int numeroSorteado) {
        if (numeroDigitado > numeroSorteado) {
            System.out.println("Você errou");
            System.out.println("O numero que vocÊ digitou  é maior que o numero sorteado, tente um valor menor!");
            System.out.println("Sua escolha : " + numeroDigitado + "\n");
            return false;
        } else if (numeroDigitado < numeroSorteado) {
            System.out.println("Você errou");
            System.out.println("O numero que vocÊ digitou  é menor que o numero sorteado, tente um valor maior!");
            System.out.println("Sua escolha : " + numeroDigitado + "\n");
            return false;
        } else {
            System.out.println("Voce acetrou!!!!");
            System.out.println("O Numero sorteado era " + numeroSorteado);
            return true;
        }
    }

}