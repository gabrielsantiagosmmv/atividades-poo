class funcionario {
    String nome;
    double salbruto;
    double salliq;

    funcionario(String n, double sb) {
        nome = n;
        salbruto = sb;
        salliq = salbruto * 0.9; // desconto 10%
    }

    funcionario(String n) {
        nome = n;
        salbruto = 2000;
        salliq = salbruto * 0.9;
    }

    void exibirinfo() {
        System.out.println("nome: " + nome);
        System.out.println("salbruto: " + salbruto);
        System.out.println("salliq: " + salliq);
    }
}
