class aluno extends pessoa {
    String curso;

    aluno(String n, int i, String c) {
        super(n, i);
        curso = c;
    }

    aluno(String n, String c) {
        super(n, 18);
        curso = c;
    }

    void exibirinfo() {
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("curso: " + curso);
    }
}
