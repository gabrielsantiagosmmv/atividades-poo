public class Main {
    public static void main(String[] args) {
        Produto p1 = new Eletronico("celular", 2000);
        Produto p2 = new Roupas("camiseta", 100);
        Produto p3 = new Alimento("arroz", 20);

        System.out.println(p1.nome + " preco final: " + p1.calcularprecofinal());
        System.out.println(p2.nome + " preco final: " + p2.calcularprecofinal());
        System.out.println(p3.nome + " preco final: " + p3.calcularprecofinal());
    }
}
