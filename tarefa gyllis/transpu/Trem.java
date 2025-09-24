class Trem extends Transporte {
    double dist;

    Trem(double tarifabase, double dist) {
        super(tarifabase);
        this.dist = dist;
    }

    @Override
    double calculartarifa() {
        return tarifabase + (dist * 0.8);
    }
}
