package EstruturasDecicao;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double valor1 = Double.parseDouble(leitor.nextLine());
        double valor2 = Double.parseDouble(leitor.nextLine());

        System.out.print("");

        if (valor1 > valor2) {
            System.out.print(valor1);
        } else if (valor2 > valor1) {
            System.out.print(valor2);
        } else {
            System.out.print("Os numeor são iguias");
        }
    }
}
