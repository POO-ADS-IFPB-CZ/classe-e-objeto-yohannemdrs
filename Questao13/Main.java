package Questao13;

public class Main {
    public static void main(String[] args) {
        ContaBancariaSimplificada conta1 = new ContaBancariaSimplificada("João", false);
        ContaBancariaSimplificada conta2 = new ContaBancariaSimplificada("Maria", true);

        conta1.deposita(500);
        conta2.deposita(300);

        System.out.println("\nSaldo inicial de João: R$" + conta1.saldo);
        System.out.println("Saldo inicial de Maria: R$" + conta2.saldo);

        System.out.println("\nTentativa de transferência de R$200 de João para Maria:");
        conta1.transfere(conta2, 200.0f);

        System.out.println("\nSaldo final de João: R$" + conta1.saldo);
        System.out.println("Saldo final de Maria: R$" + conta2.saldo);
    }
}