class Alimento extends Produto {

    Alimento(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    double calcularprecofinal() {
        return preco;
    }
}
