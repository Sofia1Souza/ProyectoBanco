package service;

import entity.Banco;
import entity.Cuenta;
import entity.Transferencia;

import java.util.ArrayList;
import java.util.List;

public class BancoService {
    List<Banco> bancos= new ArrayList<Banco>();
    CuentaService objCuentaSer= new CuentaService();
    ClienteService objClienteSer= new ClienteService();

public List<Banco> crearSucursal(){

  Banco objBanco= new Banco();
  objBanco.setNumSucursal(1);
  objBanco.setDireccion("Av Saez Peña Cap Fed Argentina");



Banco objBanco2= new Banco();
objBanco2.setNumSucursal(2);
objBanco2.setDireccion("Calle 34 Cartagena Colombia");


bancos.add(objBanco);
bancos.add(objBanco2);

    return bancos ;
}

public void agregarCuentas(Cuenta cuenta) {

}


}

