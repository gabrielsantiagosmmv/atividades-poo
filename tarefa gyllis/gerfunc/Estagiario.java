class Estagiario extends Funcionario {

    Estagiario(String nome, double salariobase) {
        super(nome, salariobase);
    }

    @Override
    double calcularsalario() {
        return salariobase / 2;
    }
}