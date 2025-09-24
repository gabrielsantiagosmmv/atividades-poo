public class Main {
    public static void main(String[] args) {
        Transporte t1 = new Onibus(3.0, 10);
        Transporte t2 = new Trem(4.0, 10);

        System.out.println("onibus tarifa: " + t1.calculartarifa());
        System.out.println("trem tarifa: " + t2.calculartarifa());
    }
}
