public class ProgramaPrincipal {
    public static void main(String[] args) {
        Imovel im1 = new Imovel(); 
        
        /* im1 - PARTE 2 */
        im1.nQuartos = 2;
        im1.nBanheiros = 1;
        im1.temGaragem = false;
        im1.endereco = "Rua dos fulanos, n. 0";
        im1.aluguel = true;
        im1.valorVenda = 142000;

        /* im1 - PARTE 3 e PARTE 4 */
        System.out.println("Imprimindo im1:");
        im1.imprimeDados();             
        im1.valoriza(2.5); 
        System.out.println("Imprimindo im1 com valorização de 2,5%:");        
        im1.imprimeDados();
        double imposto = im1.calculaImpostos();
        System.out.println("Imposto incidente de im1: " + imposto);

        /* im2 - PARTE 5 */
        Imovel im2 = new Imovel();

        // Valores idênticos
        /*
            O retorno do método comparaImoveis() é false, mesmo que os atributos de 
            ambos os objetos sejam idênticos. Isso ocorre porque, apesar de pertencerem
            a mesma classe, im1 e im2 são objetos diferentes. 
        */
        im2.nQuartos = 2;
        im2.nBanheiros = 1;
        im2.temGaragem = false;
        im2.endereco = "Rua dos fulanos, n. 0";
        im2.aluguel = true;
        im2.valorVenda = 142000;

        System.out.println("\nImprimindo im1 e im2 com valores iguais:");
        im2.valorVenda = 145550;
        im1.imprimeDados();
        im2.imprimeDados();
        comparaImoveis(im1, im2);

        // Valores diferentes
        /*
            Com os atributos diferentes, o retorno mesmo assim é false, porque, assim
            como explicitado acima, o teste de igualdade é feito por objetos (são objetos
            diferentes).
        */
        im2.nQuartos = 5;
        im2.nBanheiros = 3;
        im2.temGaragem = true;
        im2.endereco = "Avenida Ipiranga, n. 647";
        im2.aluguel = false;
        im2.valorVenda = 215875;

        System.out.println("\nImprimindo im1 e im2 com valores diferentes:");
        im1.imprimeDados();
        im2.imprimeDados();
        comparaImoveis(im1, im2);  


        /* im3 - PARTE 6 */
        /*
            Quando o atributo "valorVenda" de im3 é alterado, o mesmo atributo de im1
            também é, uma vez que ambos referenciam o mesmo objeto (não compartilham
            apenas a classe, mas "apontam" para a mesma entidade). 
        */
        Imovel im3 = im1;
        im3.valorVenda = 0;
        System.out.print("\nImprimindo im1 e im3 com valores de venda diferentes:\n");
        im3.imprimeDados();
        im1.imprimeDados();
    }
    
    static void comparaImoveis(Imovel im1, Imovel im2) {
        if (im1 == im2)
            System.out.println("Mesmos imóveis!");
        else
            System.out.println("Imóveis distintos!");
    }
}
