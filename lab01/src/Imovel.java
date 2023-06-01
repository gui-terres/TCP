public class Imovel {
    // Attributes
    public int nQuartos;
    public int nBanheiros;
    public boolean temGaragem;
    public String endereco;
    public boolean aluguel;
    public double valorVenda;
    public double imposto;

    // Methods
    public void imprimeDados() {
        System.out.println("=====================");
        System.out.println("Quartos: " + nQuartos);
        System.out.println("Banheiros: " + nBanheiros);
        System.out.println("Tem garagem: " + (temGaragem ? "Sim" : "Não"));
        System.out.println("Endereço: " + endereco);
        System.out.println("Alugem: " + (aluguel ? "Sim" : "Não"));
        System.out.println("Valor de venda: " + valorVenda);
        System.out.println("=====================");
    }

    public double calculaImpostos() { 
        if (aluguel)
            return (0.1 * valorVenda);
        else
            return (0.15 * valorVenda);
    }

    public void valoriza(double perc) {
        valorVenda += (perc/100) * valorVenda;
    }
}
