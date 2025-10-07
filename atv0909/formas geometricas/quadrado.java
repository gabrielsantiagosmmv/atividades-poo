class quadrado extends forma {
    double lado;

    @Override
    double calculararea() {
        double area = lado * lado;
        System.out.println("area do quadrado: " + area);
        return area;
    }
}
