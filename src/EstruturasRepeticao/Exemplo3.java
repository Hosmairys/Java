package EstruturasRepeticao;

public class Exemplo3 {

    public static void main(String[] args) throws InterruptedException {
        String[] listaCarros = {"SP2", "Maverick", "Fusca", "GT40"};

        for (String cadaCarro : listaCarros) {
            System.out.println(cadaCarro);
            Thread.sleep(1000);
        }
    }
}
