package EstruturasDecicao;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args ){

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número, para verificar se é positivo ou negativo: "); // console.log

        double numero = Double.parseDouble(leitor.nextLine());

        if (numero > 0) {
            System.out.print("positivo");
        } else if (numero < 0) {
            System.out.print("negativo");
        } else {
            System.out.print("neutro");
        }
    }
}
