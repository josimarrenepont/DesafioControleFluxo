import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro parametro: ");
        int parametro1 = sc.nextInt();
        System.out.println("Informe o segundo parametro: ");
        int parametro2 = sc.nextInt();

        try {
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parametro deve ser maiorque o primeiro");
        }
    }

    private static void contar(int parametro1, int parametro2) {
        if (parametro1 >= parametro2) {
            throw new ParametrosInvalidosException("o segundo parametro deve ser maior que o primeiro");
        }
        for (int i = parametro1; i <= parametro2; i++) {
            System.out.println("imprimindo o numero " + i);
        }
    }
}