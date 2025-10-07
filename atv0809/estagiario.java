class estagiario extends funcionario {
    double desc;

    @Override
    void exibirinfo() {
        System.out.println("cargo: estagiario");
        System.out.println("nome: " + nome);
        System.out.println("salario: " + salario);
        System.out.println("desc: " + desc);
        System.out.println("salario final: " + (salario - desc));
    }
}
