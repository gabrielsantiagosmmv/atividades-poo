class Roupas extends Produto {

    Roupas(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    double calcularprecofinal() {
        return preco - (preco * 0.15);
    }
}
