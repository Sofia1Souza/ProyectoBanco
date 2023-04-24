package service;

import entities.Banco;
import entities.Cuenta;
import entities.Transferencia;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TransferenciaService {
    BancoService objBancoService = new BancoService();
    Scanner leer = new Scanner(System.in);

    public Transferencia hacerTransferencia(Cuenta cuentaOrigen, Cuenta cuentaDestino) {
           Transferencia objTransferencia=null;

        System.out.println("Ingrese el monto que desea transferir");
        double montoTransferencia= leer.nextDouble();

        if (cuentaOrigen.getSaldo() >= montoTransferencia) {
            cuentaOrigen.setSaldo(cuentaOrigen.getSaldo() - montoTransferencia);
            cuentaDestino.setSaldo(cuentaDestino.getSaldo() + montoTransferencia);

            int numTransferencia = new Random().nextInt(100) + 1;
           objTransferencia = new Transferencia(numTransferencia, cuentaOrigen, cuentaDestino,montoTransferencia);
           cuentaOrigen.getTransferencias().add(objTransferencia);
            cuentaDestino.getTransferencias().add(objTransferencia);

            System.out.println("Transferencia exitosa");
        } else {
            System.out.println("Saldo insuficientes");
        }

   return objTransferencia;
    }


}
