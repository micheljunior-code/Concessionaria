
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Nissan", "Skyline", 2008, 2);
        Moto moto = new Moto("Honda", "CG Titan", 2014, 250);
        Caminhao caminhao = new Caminhao("Volvo", "FH", 2021, 30.0);
        Onibus onibus = new Onibus("Mercedes-Benz", "Escolar", 2014, 60);

        Veiculo[] veiculos = {carro, moto, caminhao, onibus};

        for (Veiculo veiculo : veiculos) {
            veiculo.exibirDetalhes();
            veiculo.mover();
            System.out.println();
        }
    }
}
