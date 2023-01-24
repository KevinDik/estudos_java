import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<5; i++) {
            System.out.println("Valor de i: " + i);
            }
        int valor = sc.nextInt();
        while (valor != 0) {
            valor = sc.nextInt();
        }

        sc.close();
    }
}
