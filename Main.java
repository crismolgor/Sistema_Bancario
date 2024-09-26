/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Controlador.BancoControlador;
import Modelo.Cliente;
import Modelo.Cuenta;
import Vista.BancoVista;

public class Main {
    public static void main(String[] args) {
        
        BancoVista vista = new BancoVista();

        BancoControlador controlador = new BancoControlador(vista);

        Cliente cliente1 = new Cliente("Juan Perez", "123456");

        Cuenta cuenta1 = controlador.crearCuenta("001", cliente1);

        vista.mostrarDetallesCliente(cliente1);

        controlador.depositar(cuenta1, 500.0);
        controlador.retirar(cuenta1, 200.0);
        controlador.retirar(cuenta1, 1000.0);

        controlador.realizarTransaccion(cuenta1, 500.0, "Deposito");
    }
}

