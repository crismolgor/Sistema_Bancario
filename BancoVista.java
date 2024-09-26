/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Cliente;
import Modelo.Cuenta;
import Modelo.Transaccion;

public class BancoVista {
    public void mostrarDetallesCliente(Cliente cliente) {
        System.out.println("Cliente: " + cliente.getNombre() + ", ID: " + cliente.getId());
    }

    public void mostrarSaldo(Cuenta cuenta) {
        System.out.println("Cuenta " + cuenta.getNumeroCuenta() + " - Saldo: $" + cuenta.getSaldo());
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarDetallesTransaccion(Transaccion transaccion) {
        System.out.println(transaccion.getDetallesTransaccion());
    }
}
