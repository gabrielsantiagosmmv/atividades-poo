class retangulo extends forma {
    double altura;
    double largura;

    @Override
    double calculararea() {
        double area = altura * largura;
        System.out.println("area do retangulo: " + area);
        return area;
    }
}
