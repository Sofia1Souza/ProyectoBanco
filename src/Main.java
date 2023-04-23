import entities.Cliente;
import entities.Cuenta;
import service.BancoService;
import service.ClienteService;
import service.CuentaService;
import service.TransferenciaService;

public class Main {
    public static void main(String[] args) {

        BancoService objBancoService= new BancoService();
        ClienteService objClienteservice = new ClienteService();
        CuentaService objCuentaservice = new CuentaService();
        TransferenciaService objTransferenciaService= new TransferenciaService();


        objBancoService.crearBanco(1,"Av Saez Peña Cap Fed Argentina");
        objBancoService.crearBanco(2,"Calle 34 Cartagena Colombia");


       Cliente cliente1=objClienteservice.CrearCliente("Julia","Solano","34526781");
       Cliente cliente2=objClienteservice.CrearCliente("Marcos","Funes","32123987");

         Cuenta cuenta1=objCuentaservice.crearCuenta(cliente1,1);
        Cuenta cuenta2=objCuentaservice.crearCuenta(cliente2,2);

        objTransferenciaService.hacerTransferencia(cuenta1,cuenta2,5000);
        System.out.println(cuenta1.getSaldo());
        System.out.println(cuenta2.getSaldo());








    }
}