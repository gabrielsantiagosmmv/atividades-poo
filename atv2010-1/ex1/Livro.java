public class Livro {
    public String titulo;
    private String autor;
    protected int paginas;
     public Livro(String t, String a, int p){
         titulo = t;
         autor = a;
         paginas = p;
     }
     public String getAutor(){
         return autor;
     }
     public void setAutor(String a){
         autor = a;
     }
     public void exibirInfo(){
         System.out.println("Titulo: " + this.titulo);
         System.out.println("Paginas " + this.paginas);
     }
}