package EstruturasDecicao;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o salario: "); //console.log()

        //double salario = Double.parseDouble(leitor.nextLine()); // pegar o que a pessoa digita
        double salario = leitor.nextDouble(); // leiotor para pegar com o virgula do numeros

        if (salario < 1000) {
            double salarioReajustado = salario * 1.1;
            System.out.println(salarioReajustado);
        }else {
            System.out.println("Salario sem reajuste");
        }
    }
}
