public class MainLivro {
    public static void main(String[] args) {
        Livro l1 = new Livro("O principe", "Nicolau Maquiavel", 120);
        Livro l2 = new Livro("A Tempestade", "Shakespeare", 200);

        l1.exibirInfo();
        l2.exibirInfo();

        //exibir direto da main
        System.out.println(l1.titulo);
        System.out.println(l1.paginas);

        System.out.println(l1.getAutor());

        l1.setAutor("Nicolau Maquiavel (Edicao Revisada)");
        System.out.println(l1.getAutor());
    }
}