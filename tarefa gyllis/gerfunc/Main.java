public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Gerente("luana", 3000, 1000);
        Funcionario f2 = new Programador("jose", 2000, 10);
        Funcionario f3 = new Estagiario("maria", 1500);

        System.out.println(f1.nome + " ganha: " + f1.calcularsalario());
        System.out.println(f2.nome + " ganha: " + f2.calcularsalario());
        System.out.println(f3.nome + " ganha: " + f3.calcularsalario());
    }
}