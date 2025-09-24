class Gerente extends Funcionario {
    double bonus;

    Gerente(String nome, double salariobase, double bonus) {
        super(nome, salariobase);
        this.bonus = bonus;
    }

    @Override
    double calcularsalario() {
        return salariobase + bonus;
    }
}