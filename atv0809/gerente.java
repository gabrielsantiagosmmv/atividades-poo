class gerente extends funcionario {
    double bonif;

    @Override
    void exibirinfo() {
        System.out.println("cargo: gerente");
        System.out.println("nome: " + nome);
        System.out.println("salario: " + salario);
        System.out.println("bonif: " + bonif);
        System.out.println("salario final: " + (salario + bonif));
    }
}
