/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Transaccion {
    private Cuenta cuenta;
    private double monto;
    private String tipo; // "Deposito" o "Retiro"

    public Transaccion(Cuenta cuenta, double monto, String tipo) {
        this.cuenta = cuenta;
        this.monto = monto;
        this.tipo = tipo;
    }

    public String getDetallesTransaccion() {
        return tipo + " de $" + monto + " en la cuenta " + cuenta.getNumeroCuenta();
    }
}

