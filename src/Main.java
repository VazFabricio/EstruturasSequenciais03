import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digte um número inteiro: ");
        numero1 = sc.nextInt();

        System.out.print("Digte um número inteiro: ");
        numero2 = sc.nextInt();

        int soma = numero1 + numero2;
        System.out.print(soma);

    }

}