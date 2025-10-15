public class main {
    public static void main(String[] args) {
        aluno a1 = new aluno("joao", 20, "2025001");
        aluno a2 = new aluno("maria", 18, "2025002");

        a1.exibirdados();
        a2.exibirdados();

        a1.nome = "joao silva";
        a1.matricula = "2025999";

        System.out.println("apos atualizacao:");
        a1.exibirdados();
    }
}
