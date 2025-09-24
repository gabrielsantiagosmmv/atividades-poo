public class Main {
    public static void main(String[] args) {
        Pedido p1 = new PedidoMesa(100);
        Pedido p2 = new PedidoDelivery(100);

        System.out.println("mesa: " + p1.calcularvalfinal());
        System.out.println("delivery: " + p2.calcularvalfinal());
    }
}
