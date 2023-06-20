import java.util.Scanner;

public class EFinal4 {
    public static void main(String[] args) {
        Scanner teclea = new Scanner(System.in);
        System.out.println("Inserta número de asteriscos: ");
        int lado = teclea.nextInt();

        for (int i = 1; i <= lado; i++) {
            for (int j = 1; j <= lado; j++) {
                System.out.println(" * ");
            }
            System.out.println();
        }
    }
}
