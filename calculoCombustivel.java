import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tempo = s.nextInt();
        int velocidade = s.nextInt();
        double litros = (tempo * velocidade) / 12.0;
        System.out.printf("%.3f%n",litros);
    }
}