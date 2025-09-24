class Eletronico extends Produto {

    Eletronico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    double calcularprecofinal() {
        return preco - (preco * 0.1);
    }
}
