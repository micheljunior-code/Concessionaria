class Caminhao extends Veiculo {
    private double capacidadeDeCarga;

    public Caminhao(String marca, String modelo, int ano, double capacidadeDeCarga) {
        super(marca, modelo, ano);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    @Override
    public void mover() {
        System.out.println("O caminhão está transportando carga.");
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Capacidade de carga: " + capacidadeDeCarga + " toneladas");
    }
}
