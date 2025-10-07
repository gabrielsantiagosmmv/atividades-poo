public class main {
    public static void main(String[] args) {

        System.out.println("--- funcionarios ---");
        gerente g1 = new gerente();
        g1.nome = "lucas";
        g1.salario = 8000;
        g1.bonif = 2000;
        g1.exibirinfo();

        engenheiro e1 = new engenheiro();
        e1.nome = "ana";
        e1.salario = 7000;
        e1.esp = "software";
        e1.exibirinfo();

        estagiario s1 = new estagiario();
        s1.nome = "joao";
        s1.salario = 2000;
        s1.desc = 200;
        s1.exibirinfo();

        System.out.println("\n--- veiculos ---");
        carro c1 = new carro();
        c1.marca = "toyota";
        c1.modelo = "corolla";
        c1.ano = 2022;
        c1.nportas = 4;
        c1.acelerar();
        c1.frear();

        moto m1 = new moto();
        m1.marca = "honda";
        m1.modelo = "cb500";
        m1.ano = 2023;
        m1.cil = 500;
        m1.acelerar();
        m1.frear();

        caminhao t1 = new caminhao();
        t1.marca = "volvo";
        t1.modelo = "fh";
        t1.ano = 2021;
        t1.capcarga = 20.5;
        t1.acelerar();
        t1.frear();

        System.out.println("\n--- animais ---");
        animal[] lista = { new cachorro(), new gato(), new papagaio() };
        for (animal a : lista) {
            a.fazersom();
        }
    }
}
