class Funcionario {
    String nome;
    double salariobase;

    // construtor
    Funcionario(String nome, double salariobase) {
        this.nome = nome;
        this.salariobase = salariobase;
    }

    // metodo para calcular salario
    double calcularsalario() {
        return salariobase;
    }
}