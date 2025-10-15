public class aluno {
    public String nome;
    private int idade;
    protected String matricula;

    public aluno(String nome, int idade, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        validaridade();
    }

    public void exibirdados() {
        System.out.println("nome: " + nome);
        System.out.println("matricula: " + matricula);
    }

    private void validaridade() {
        if (idade > 0) {
            System.out.println("idade valida: " + idade);
        } else {
            System.out.println("idade invalida");
        }
    }
}
