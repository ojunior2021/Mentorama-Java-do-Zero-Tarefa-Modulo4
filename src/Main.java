import carro.Carro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("****  Sistema para cadastro de Veículos ****");

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o marca do veículo: ");
        String marca = input.nextLine();

        System.out.print("Digite o numero de portas do veículo: ");
        int numeroPortas = Integer.parseInt(input.nextLine());

        System.out.print("Digite o tipo de combustivel do veículo: ");
        String combustivel = input.nextLine();

        System.out.print("Digite a quantidade de pneus do veículo: ");
        int quantidadePneus = Integer.parseInt(input.nextLine());

        System.out.print("Digite o numero do Chassi do veiculo: ");
        String numeroChassi = input.nextLine();

        System.out.print("Digite a quantidade de calotas do veículo: ");
        int quantidadeCalotas = Integer.parseInt(input.nextLine());

        System.out.print("Digite a cor do veículo: ");
        String cor = input.nextLine();

        System.out.print("Digite o ano de fabricação do veículo: ");
        int anoFabricacao = input.nextInt();

        Carro carro = new Carro(numeroPortas, anoFabricacao, quantidadePneus, marca, numeroChassi, combustivel);

        carro.setCor(cor);
        carro.setQuantidadeCalotas(quantidadeCalotas);

        System.out.println("Veículo Cadastrado com Sucesso: \n");

        System.out.println("--- Marca: " + marca);
        System.out.println("--- Ano de fabricação: " + anoFabricacao);
        System.out.println("--- Numero de portas: " + numeroPortas);
        System.out.println("--- Quantidade de pneus: " + quantidadePneus);
        System.out.println("--- Numero do chassi: " + numeroChassi);
        System.out.println("--- Tipo de combustivel : " + combustivel);
        System.out.println("--- Cor: " + carro.getCor());
        System.out.println("--- Quantidade de calotas: " + carro.getQuantidadeCalotas());

    }
}
