package carro;

public class Carro {

    private int numeroPortas, anoFabricação,quantidadePneus, quantidadeCalotas;
    private String marca, numeroChassi, combustivel, cor;

    public Carro(int numeroPortas, int anoFabricação, int quantidadePneus, String marca, String numeroChassi, String combustivel) {
        this.numeroPortas = numeroPortas;
        this.anoFabricação = anoFabricação;
        this.quantidadePneus = quantidadePneus;
        this.marca = marca;
        this.numeroChassi = numeroChassi;
        this.combustivel = combustivel;
    }

    public Integer getQuantidadeCalotas() {
        return quantidadeCalotas;
    }

    public void setQuantidadeCalotas(Integer quantidadeCalotas) {
        this.quantidadeCalotas = quantidadeCalotas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

   }
