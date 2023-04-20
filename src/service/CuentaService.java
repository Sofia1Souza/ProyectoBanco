package service;

import entity.Cliente;
import entity.Cuenta;

import java.util.Random;

public class CuentaService {

    public Cuenta crearCuenta(Cliente cliente) {

     Cuenta objCuenta= new Cuenta();
        Random random= new Random();
        int aleatorio =random.nextInt(9)+1;

     objCuenta.setNumCta(" "+(cliente.getDni())+ aleatorio);
     objCuenta.setSaldo(10000);
     objCuenta.setCliente(cliente);

     return objCuenta;
    }



}
