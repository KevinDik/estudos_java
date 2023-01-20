import java.util.Locale;
import java.util.Scanner;

public class entradaDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String x;
        x = sc.next(); // pega algo digitado
        System.out.println("voce digitou: " + x);
       
        int y;
        y = sc.nextInt(); // pega inteiros
        System.out.println("voce digitou:" + y);

        double z;
        z = sc.nextDouble(); // pega os doubles
        System.out.printf("Voce digitou: %.2f%n", z);

        char b;
        b = sc.next().charAt(0); // pega somente a primeira letra
        System.out.println("Voce digitou: " + b);

        String nome;
        int idade;
        double peso;

        nome = sc.next();
        idade = sc.nextInt();
        peso = sc.nextDouble();

        System.out.println("Dados digitados"); // ler varios dados seguidos de espaco
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(peso);

        String s1, s2, s3;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados digitados"); // ler varios dados ate a quebra de linha
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
