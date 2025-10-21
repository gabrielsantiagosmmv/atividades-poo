public class Main {
    
    public static void main(String args[]) {
        Produto p1 = new Produto();
        p1.nome = "coca cola";
        p1.quantidade = 15;
        //p1.preco = 10;

        p1.venderProduto(5);
        p1.exibirInfo();
  
        p1.nome = "pepsi";
        p1.quantidade = 30;
        p1.exibirInfo();

  
    }
        
}
