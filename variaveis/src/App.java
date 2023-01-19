public class App {
    public static void main(String[] args) throws Exception {
        int n1 = 8;
        int n2 = 5;

        int resultado = n1 + n2;
        System.out.println("resultado " + resultado);

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
}
