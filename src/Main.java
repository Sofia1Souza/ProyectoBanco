import service.BancoService;
import service.ClienteService;
import service.CuentaService;
import service.TransferenciaService;

public class Main {
    public static void main(String[] args) {

        BancoService objBancoService= new BancoService();
        ClienteService service = new ClienteService();


        objBancoService.crearBanco(1,"Av Saez Peña Cap Fed Argentina");
        objBancoService.crearBanco(2,"Calle 34 Cartagena Colombia");

        service.CrearCliente();
        service.CrearCliente();







    }
}