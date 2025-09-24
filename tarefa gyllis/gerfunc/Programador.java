class Programador extends Funcionario {
    int horasextras;

    Programador(String nome, double salariobase, int horasextras) {
        super(nome, salariobase);
        this.horasextras = horasextras;
    }

    @Override
    double calcularsalario() {
        return salariobase + (horasextras * 50);
    }
}