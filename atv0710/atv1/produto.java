public class produto {
    public String nome;
    private double preco;
    protected int quantidade;

    public produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void venderproduto(int unidades) {
        if (unidades > quantidade) {
            System.out.println("erro: quantidade em estoque insuficiente.");
        } else {
            quantidade -= unidades;
            System.out.println(unidades + " unidade(s) vendida(s). estoque restante: " + quantidade);
        }
    }

    public void exibirinfo() {
        System.out.println("nome do produto: " + nome);
        System.out.println("quantidade em estoque: " + quantidade);
    }
}
