public class Produto{
    
    public String nome;
    private double preco;
    protected int quantidade;
    
    public void venderProduto(int unidades){
        if (unidades <= quantidade){
            quantidade -= unidades;
            System.out.println("venda realizada com sucesso");
        }else{
            System.out.println("ERRO: estoque insuficiente.");
        }
    }

    public void exibirInfo(){
        System.out.println(this.nome + " - quantidade: " + this.quantidade);
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double novoPreco){
        this.preco = novoPreco;
    }





























}