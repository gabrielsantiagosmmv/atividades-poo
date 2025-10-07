class engenheiro extends funcionario {
    String esp;

    @Override
    void exibirinfo() {
        System.out.println("cargo: engenheiro");
        System.out.println("nome: " + nome);
        System.out.println("salario: " + salario);
        System.out.println("esp: " + esp);
    }
}
