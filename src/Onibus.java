class Onibus extends Veiculo {
    private int numeroDeAssentos;

    public Onibus(String marca, String modelo, int ano, int numeroDeAssentos) {
        super(marca, modelo, ano);
        this.numeroDeAssentos = numeroDeAssentos;
    }


    @Override
    public void mover() {
        System.out.println("O ônibus está transportando passageiros.");
    }


    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Número de assentos: " + numeroDeAssentos);
    }
}