package service;

import entities.Banco;
import entities.Cliente;
import entities.Cuenta;

import java.util.ArrayList;
import java.util.List;

public class BancoService {
    List<Cuenta> cuentas = new ArrayList<Cuenta>();
    List<Banco> bancos = new ArrayList<Banco>();

    ClienteService objClienteService = new ClienteService();

    public void crearBanco(int sucursal, String direccion) {

        Banco objBanco1 = new Banco();
        objBanco1.setNumSucursal(sucursal);
        objBanco1.setDireccion(direccion);

        Banco objBanco2 = new Banco();
        objBanco2.setNumSucursal(sucursal);
        objBanco2.setDireccion(direccion);

        bancos.add(objBanco1);
        bancos.add(objBanco2);

    }

    public void agregarInfo(Cliente cliente) {
        int numSucursalCliente = cliente.getCuenta().getNumSucursal();

        for (Banco banco : bancos) {
            if (numSucursalCliente == banco.getNumSucursal()) {
               List<Cliente> clientes= banco.getClientes();
               clientes.add(cliente);
               List<Cuenta>cuentas= banco.getCuentas();
                cuentas.add(cliente.getCuenta());
            }

        }

    }



}

