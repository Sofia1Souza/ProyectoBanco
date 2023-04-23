package service;

import entities.Cliente;
import entities.Cuenta;

import java.util.Random;

public class CuentaService {

    public Cuenta crearCuenta(Cliente cliente, int sucursal) {

        Cuenta objCuenta = new Cuenta();
        int idAleatorio = new Random().nextInt(9) + 1;

        objCuenta.setNumCta(" " + (cliente.getDni()) + idAleatorio);
        objCuenta.setSaldo(10000);
        objCuenta.setCliente(cliente);
        objCuenta.setNumSucursal(sucursal);

        return objCuenta;
    }


}
