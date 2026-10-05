public class CarrinhoDeCompras {
    public static void main(String[] args) {

        double precoArroz = 5.50;
        int quantidadeArroz = 2;
        double subtotalArroz = precoArroz * quantidadeArroz;
        double precoFeijao = 7.00;
        int quantidadeFeijao = 3;
        double subtotalFeijao = precoFeijao * quantidadeFeijao;
        double precoCafe = 20.00;
        int quantidadeCafe = 1;
        double subtotalCafe = precoCafe * quantidadeCafe;

        double precoTotal = subtotalArroz + subtotalFeijao + subtotalCafe;

        System.out.println("===== CARRINHO DE COMPRAS =====");
        System.out.println("Arroz (x" + quantidadeArroz + "): R$ " + subtotalArroz);
        System.out.println("Feijão (x" + quantidadeFeijao + "): R$ " + subtotalFeijao);
        System.out.println("Café (x" + quantidadeCafe + "): R$ " + subtotalCafe);
        System.out.println("TOTAL: R$ " + precoTotal);
    }
}
