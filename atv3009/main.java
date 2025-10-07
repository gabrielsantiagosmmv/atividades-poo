public class main {
    public static void main(String[] args) {

        System.out.println("--- funcionarios ---");
        funcionario f1 = new funcionario("lucas", 5000);
        funcionario f2 = new funcionario("ana");

        f1.exibirinfo();
        System.out.println();
        f2.exibirinfo();

        System.out.println("\n--- alunos ---");
        aluno a1 = new aluno("joao", 20, "analise de sistemas");
        aluno a2 = new aluno("maria", "engenharia");

        a1.exibirinfo();
        System.out.println();
        a2.exibirinfo();
    }
}
