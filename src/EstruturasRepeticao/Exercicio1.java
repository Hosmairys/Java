package EstruturasRepeticao;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String usuario;
        String senha;

        do {
            System.out.println("Digite o nome do usuario: ");
            usuario = leitor.nextLine();
            System.out.println("Digite a senha: ");
            senha = leitor.nextLine();

            if (usuario.equals("admin") && senha.equals("senha123")){
                System.out.println("Login bem-sucedido");
            }
        } while (usuario.equals("admin") && senha.equals("senha123"));

        System.out.println("Nome de usuario ou senha incorretos.");
    }
}
