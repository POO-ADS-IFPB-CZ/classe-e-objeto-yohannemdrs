package Questao13;

public class ContaBancariaSimplificada {
    String nomeDoCorrentista;
    float saldo;
    boolean contaEspecial;

    public ContaBancariaSimplificada(String nomeDoCorrentista, boolean contaEspecial) {
        this.nomeDoCorrentista = nomeDoCorrentista;
        this.saldo = 0; // Saldo inicial zero
        this.contaEspecial = contaEspecial;
    }

    public void deposita(float valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado. Saldo atual de " + nomeDoCorrentista + ": R$" + saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public boolean retira(float valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Saldo atual de " + nomeDoCorrentista + ": R$" + saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
            return false;
        }
    }

    public boolean transfere(ContaBancariaSimplificada contaDestino, float valor) {
        if (retira(valor)) {
            contaDestino.deposita(valor);
            System.out.println("Transferência de R$" + valor + " para " + contaDestino.nomeDoCorrentista + " realizada com sucesso.");
            return true;
        } else {
            System.out.println("Transferência falhou. Verifique o saldo.");
            return false;
        }
    }
}
