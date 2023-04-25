package service;


import entities.Cuenta;
import entities.Transferencia;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class TransferenciaService {
    Scanner leer = new Scanner(System.in);

    public Transferencia hacerTransferencia(Cuenta cuentaOrigen, Cuenta cuentaDestino) {
        Transferencia objTransferencia = null;
        Double montoTransferencia = null;

        do {
            try {
                System.out.println("");
                System.out.println("Ingrese el monto que desea transferir");
                montoTransferencia = leer.nextDouble();


            } catch (InputMismatchException e) {
                System.out.println("no puede ingresar caracteres");
                leer.nextLine();
            }

        } while (montoTransferencia == null);


        if (cuentaOrigen.getSaldo() >= montoTransferencia) {

            if (montoTransferencia > 0) {
                cuentaOrigen.setSaldo(cuentaOrigen.getSaldo() - montoTransferencia);
                cuentaDestino.setSaldo(cuentaDestino.getSaldo() + montoTransferencia);

                int numTransferencia = new Random().nextInt(100) + 1;

                objTransferencia = new Transferencia(numTransferencia, cuentaOrigen, cuentaDestino, montoTransferencia);
                objTransferencia.setDetalle(detalleTransferencia(objTransferencia));
                cuentaOrigen.getTransferencias().add(objTransferencia);
                cuentaDestino.getTransferencias().add(objTransferencia);

                System.out.println("Transferencia exitosa!!");

            } else {
                System.out.println("No puede ingresar un monto negativo");
            }

            }else{
            System.out.println("Saldo insuficiente");

        }
        System.out.println();
        System.out.println("El monto que le queda en su cuenta es:" + cuentaOrigen.getSaldo());
        System.out.println("--------------------------------------------");

      return objTransferencia;
    }

    public String detalleTransferencia( Transferencia transferencia){
        String detalle = "\n" +
                " --------COMPROBANTE DE TRANSFERENCIA:-------" + "\n" +
                "Fecha: " + transferencia.getFechaTransferencia() + "\n" +
                "Numero de operacion: " + transferencia.getNumTransferencia() + "\n" +
                "Cuenta de origen: " + transferencia.getCuentaOrigen().getNumCta() + "\n" +
                "Nombre titular: " + transferencia.getCuentaOrigen().getCliente()+ "\n" +
                "Cuenta de destino: " + transferencia.getCtaDestino().getNumCta();

        return detalle;
    }


    }



