import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;
        System.out.println("Seu peso ideal é: " + pesoIdeal + "kg");

        scanner.close();
    }
}