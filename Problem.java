package dasafio.dio;
import java.io.IOException;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        System.out.print("DIGITE A PRIMEIRA ENTRADA: ");
        int N = leitor.nextInt();
        System.out.print("DIGITE A SEGUNDA E A TERCEIRA ENTRADA: ");
        int A = leitor.nextInt() + leitor.nextInt();
        //TODO: Complete o If com a condição que soluciona o problema.
        if (N > A || N < A)
            System.out.println("Deixa para amanha!");
        else
            System.out.println("Farei hoje!");
    }

}