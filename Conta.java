package br.com.bank;

/**
 * @author marcelo r silva
 * Classe responsável por modelar uma conta bancária simples
 */

public class Conta {

    private String titular;
    private int numeroDaConta;
    private double saldo;

    // Construtor da classe
    public Conta(String titular, int numeroDaConta) {
        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
    }

    public String getTitular() {
        return titular;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    // Método que retorna imprime na tela o dados da conta e o saldo do cliente
    public void imprimirSaldo(){
        System.out.println("\tExtrado da Conta: ");
        System.out.println("Nome do titular: " + this.titular);
        System.out.println("Número da conta: " + this.numeroDaConta);
        System.out.printf("Saldo atual: %.2f\n",this.saldo + "\n");
    }

    // Método responsável por permitir depositos na conta, e mostrar o saldo após o depósito
    public void depositar( double valor)
    {
        saldo += valor;
        System.out.println("Deposito: " + valor);
        System.out.println("Saldo atual: " + saldo + "\n");
    }

    // Método responsável por permitir o saque na conta, e mostrar o saldo após o saque.
    public void sacar(double valor){
        if(saldo >= valor){
            saldo -= valor;
            System.out.println("Valor do saque: " + valor);
            System.out.println("Saldo atual: " + saldo + "\n");
        } else {
            System.out.println("Saldo insuficiente :( ");
        }
    }


}
