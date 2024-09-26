/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import Modelo.Cuenta;
import Modelo.Transaccion;
import Vista.BancoVista;

public class BancoControlador {
    private BancoVista vista;

    public BancoControlador(BancoVista vista) {
        this.vista = vista;
    }

    public Cuenta crearCuenta(String numeroCuenta, Cliente cliente) {
        Cuenta cuenta = new Cuenta(numeroCuenta, cliente);
        vista.mostrarMensaje("Cuenta creada exitosamente.");
        return cuenta;
    }

    public void depositar(Cuenta cuenta, double monto) {
        cuenta.depositar(monto);
        vista.mostrarMensaje("Se ha depositado $" + monto + " en la cuenta " + cuenta.getNumeroCuenta());
        vista.mostrarSaldo(cuenta);
    }

    public void retirar(Cuenta cuenta, double monto) {
        if (cuenta.retirar(monto)) {
            vista.mostrarMensaje("Se ha retirado $" + monto + " de la cuenta " + cuenta.getNumeroCuenta());
        } else {
            vista.mostrarMensaje("Fondos insuficientes.");
        }
        vista.mostrarSaldo(cuenta);
    }

    public void realizarTransaccion(Cuenta cuenta, double monto, String tipo) {
        Transaccion transaccion = new Transaccion(cuenta, monto, tipo);
        vista.mostrarDetallesTransaccion(transaccion);
    }
}

