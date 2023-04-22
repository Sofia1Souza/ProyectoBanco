package service;

import entity.Banco;
import entity.Cliente;
import entity.Cuenta;
import entity.Transferencia;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class TransferenciaService {


    public Transferencia hacerTransferencia(List<Banco> bancos) {

        Scanner leer = new Scanner(System.in);
        Transferencia objTransferencia = new Transferencia();
        System.out.println("¿A que cuenta  desea transferir?");

        for (Banco banco : bancos) {
            for (Cuenta cuenta : banco.getCuentas()) {
                System.out.println(cuenta.getNumCta());
            }
        }

        String opcion = leer.nextLine();

        System.out.println("¿Que monto desea transferir?");
        objTransferencia.setMonto(leer.nextDouble());

        for (Banco banco : bancos) {
            for (Cuenta cuenta : banco.getCuentas()) {
                if (!cuenta.getNumCta().equals(opcion)) {
                    cuenta.setSaldo(cuenta.getSaldo() - objTransferencia.getMonto());

                } else {
                    System.out.println("Ha seleccionado su propia cuenta");
                }

            }


        }
        for (Banco banco : bancos) {
            for (Cuenta cuenta : banco.getCuentas()) {
                if (cuenta.getNumCta().equals(opcion)) {
                    cuenta.setSaldo(cuenta.getSaldo() + objTransferencia.getMonto());


                }

            }

        }
        return objTransferencia;
    }
}