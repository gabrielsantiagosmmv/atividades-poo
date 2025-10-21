public class Aluno{

    public String nome;
    private int idade;
    protected String matricula;

    public Aluno(String n, int i, String m){
        nome = n;
        idade = i;
        matricula = m;
    }

    public void exibirDados(){
        System.out.println(this.nome + " - " + this.matricula);
    }

    private void validarIdade(){
        if(this.idade > 0){
            System.out.println("A idade é valida!");
        }else{
            System.out.println("A idade nao é valida.");
        }
    }   

}