import entities.Cliente;
import entities.Cuenta;
import service.BancoService;
import service.CuentaService;
import service.TransferenciaService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        BancoService objBancoService= new BancoService();
        CuentaService objCuentaservice = new CuentaService();
        TransferenciaService objTransferenciaService= new TransferenciaService();


        objBancoService.crearBanco(1,"Av Saez Peña Cap Fed Argentina");
        objBancoService.crearBanco(2,"Calle 34 Cartagena Colombia");



       Cliente cliente1=objBancoService.agregarCliente("Julia","Nandez","34567892");
       Cliente cliente2=objBancoService.agregarCliente("Marcos","Funes","32123987");


       Cuenta cuenta1=objCuentaservice.crearCuenta(cliente1,1);
       Cuenta cuenta2=objCuentaservice.crearCuenta(cliente2,2);

       cliente1.setCuenta(cuenta1);
       cliente2.setCuenta(cuenta2);

       objBancoService.mostrarBanco();
       objBancoService.mostrarCliente();


        objTransferenciaService.hacerTransferencia(cuenta1,cuenta2);
        System.out.println("El monto que le queda en su cuenta es:" +cuenta1.getSaldo());
        System.out.println("--------------------------------------------");
        System.out.println("Saldo de la Cuenta destino");
        System.out.println(cuenta2.getSaldo());

        objBancoService.mostrarCliente();

    }
}