package org.example.Prueba;

import org.example.Cliente;

public class Cuenta {

    private static int contadorCuentas = 0;

    private String iban;
    private org.example.Cliente titular;
    private double saldo;

    public Cuenta(String iban, org.example.Cliente titular, double saldo) {
        this.iban = iban;
        this.titular = titular;
        this.saldo = saldo;
    }

    //region Getters y Setters
    public org.example.Cliente titular() {
        return titular;
    }

    public Cuenta setTitular(Cliente titular) {
        this.titular = titular;
        return this;
    }

    public double saldo() {
        return saldo;
    }

    public Cuenta setSaldo(double saldo) {
        this.saldo = saldo;
        return this;
    }

    public String iban() {
        return iban;
    }

    public Cuenta setIban(String iban) {
        this.iban = iban;
        return this;
    }
    //endregion

    private String calcularIBAN() {
        return String.format("ES%03d", contadorCuentas++);
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "iban='" + iban + '\'' +
                ", titular=" + titular +
                ", saldo=" + saldo +
                '}';
    }

}
