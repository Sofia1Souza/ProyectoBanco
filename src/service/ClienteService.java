package service;

import entities.Cliente;
import entities.Cuenta;


public class ClienteService {

    public Cliente CrearCliente(String nombre, String apellido, String dni) {

        Cliente cliente = new Cliente(nombre, apellido, dni);

        return cliente;
    }

}
