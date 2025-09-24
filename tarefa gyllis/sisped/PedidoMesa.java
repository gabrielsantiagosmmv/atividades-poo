class PedidoMesa extends Pedido {

    PedidoMesa(double val) {
        super(val);
    }

    @Override
    double calcularvalfinal() {
        return val + (val * 0.1);
    }
}
