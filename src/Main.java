import entity.Banco;
import service.BancoService;
import service.ClienteService;
import service.CuentaService;
import service.TransferenciaService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        BancoService objBancoService= new BancoService();
        ClienteService objClienteservice = new ClienteService();


        objBancoService.crearBanco(1,"Av Saez Peña Cap Fed Argentina");
        objBancoService.crearBanco(2,"Calle 34 Cartagena Colombia");

        objClienteservice.CrearCliente();
        objClienteservice.CrearCliente();


   TransferenciaService objServiceTransferencia = new TransferenciaService();
   objServiceTransferencia.hacerTransferencia();





    }
}