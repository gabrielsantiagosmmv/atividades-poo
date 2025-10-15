public class Livro {
    public String titulo;
    private String autor;
    protected int paginas;

    public Livro(String titulo, String autor, int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    public void exibirinfo(){
        System.out.println("titulo: " + titulo);
        System.out.println("Paginas: " + paginas);
    }
}
