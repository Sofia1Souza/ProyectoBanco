package service;

import entity.Banco;
import entity.Cliente;
import entity.Cuenta;
import entity.Transferencia;

import java.util.ArrayList;
import java.util.List;

public class BancoService {
    List<Cuenta> cuentas=new ArrayList<Cuenta>();
    List<Cliente> clientes= new ArrayList<Cliente>();
    List<Banco> bancos = new ArrayList<Banco>();
    ClienteService objClienteSer = new ClienteService();
    TransferenciaService objtransfservice = new TransferenciaService();

    public Banco crearBanco(int sucursal, String direccion) {

        Banco objBanco = new Banco();
        objBanco.setNumSucursal(sucursal);
        objBanco.setDireccion(direccion);

        bancos.add(objBanco);

        return objBanco;
    }

    //agregrar clientes a la lista de clientes del banco,entonces capturo el cliente y con un for each recorro la lista de bancs
    // que tengo,ahi le digo si la cta y el nume de sucursal es igual le agrego el banco el cliente

    public void agregarListas() {
        Cliente cliente = objClienteSer.CrearCliente();

        for (Banco banco : bancos) {
            if (cliente.getCuenta().getSucursal() == (banco.getNumSucursal())) {
                banco.getClientes().add(cliente);
                //corresponde a este banco
                banco.getCuentas().add(cliente.getCuenta());
            }
        }

    }

    public void agregarTransferencias() {
        objtransfservice.hacerTransferencia(bancos);


    }
}
