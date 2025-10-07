class circulo extends forma {
    double raio;

    @Override
    double calculararea() {
        double area = 3.14159 * raio * raio;
        System.out.println("area do circulo: " + area);
        return area;
    }
}
