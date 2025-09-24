class Onibus extends Transporte {
    double dist;

    Onibus(double tarifabase, double dist) {
        super(tarifabase);
        this.dist = dist;
    }

    @Override
    double calculartarifa() {
        return tarifabase + (dist * 0.5);
    }
}
