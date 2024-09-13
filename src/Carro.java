class Carro extends Veiculo {
    private int quantidadeDePortas;

    public Carro(String marca, String modelo, int ano, int quantidadeDePortas) {
        super(marca, modelo, ano);
        this.quantidadeDePortas = quantidadeDePortas;
    }


    @Override
    public void mover() {
        System.out.println("O carro está acelerando na estrada.");
    }


    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Quantidade de portas: " + quantidadeDePortas);
    }
}