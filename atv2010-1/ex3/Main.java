public class Main {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 16, "172");
        Aluno a2 = new Aluno("Joao", 17, "271");

        a1.exibirDados();
        a2.exibirDados();

        // a1.idade = 20;
         // a1.validarIdade();

        a1.nome = "Ana Clara";
        a1.matricula = "999";
        a1.exibirDados();
    }
}

