public class main {
    public static void main(String[] args) {
        produto p1 = new produto("teclado", 250.0, 10);

        p1.venderproduto(3);

        p1.exibirinfo();

        p1.nome = "teclado gamer";
        p1.quantidade = 15;

        System.out.println("apos atualizacao:");
        p1.exibirinfo();
    }
}
