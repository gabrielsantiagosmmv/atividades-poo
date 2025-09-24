class PedidoDelivery extends Pedido {

    PedidoDelivery(double val) {
        super(val);
    }

    @Override
    double calcularvalfinal() {
        return val + (val * 0.05);
    }
}
