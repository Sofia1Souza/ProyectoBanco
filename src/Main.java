import entities.Banco;
import entities.Cliente;
import entities.Cuenta;
import service.BancoService;
import service.CuentaService;
import service.TransferenciaService;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        BancoService objBancoService= new BancoService();
        CuentaService objCuentaservice = new CuentaService();
        TransferenciaService objTransferenciaService= new TransferenciaService();
        List<Banco> bancos = new ArrayList();
        List<Cliente> clientes = new ArrayList();

        objBancoService.crearBanco(bancos);

       Cliente cliente1=objBancoService.agregarCliente1(clientes);
       Cliente cliente2=objBancoService.agregarCliente2(clientes);


       Cuenta cuenta1=objCuentaservice.crearCuenta(cliente1,1);
       Cuenta cuenta2=objCuentaservice.crearCuenta(cliente2,2);


       cliente1.setCuenta(cuenta1);
       cliente2.setCuenta(cuenta2);

       objBancoService.mostrarBanco(bancos);
       objBancoService.mostrarCliente(clientes);

        objTransferenciaService.hacerTransferencia(cuenta1,cuenta2);

        objBancoService.mostrarCliente(clientes);

    }
}