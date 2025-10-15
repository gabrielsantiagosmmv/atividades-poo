public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("O Principe", "Nicolau Maquiavel",120);
        Livro l2 = new Livro("Harry Potter", "JK Rowling", 305);

        System.out.println(l1.titulo);
        System.out.println(l1.paginas);

        System.out.println(l2.titulo);
        System.out.println(l2.paginas);


        l1.exibirinfo();
        l2.exibirinfo();
    }
}
