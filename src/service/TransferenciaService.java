package service;

import entity.Cliente;
import entity.Cuenta;
import entity.Transferencia;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class TransferenciaService {


public Transferencia HacerTransferencia( Cuenta cuenta1,Cuenta cuenta2){
    Scanner leer=new Scanner(System.in);
    Transferencia objTransferencia = new Transferencia();
    System.out.println("Cuanto dinero desea transferir");
    objTransferencia.setMonto(leer.nextDouble());

    if (objTransferencia.getMonto()<= cuenta1.getSaldo()){
        cuenta1.setSaldo(cuenta1.getSaldo()-objTransferencia.getMonto());
        cuenta2.setSaldo(cuenta2.getSaldo()+objTransferencia.getMonto());
        System.out.println("Operacion exitosa de la cuenta"+ cuenta1);// probando git

    }else
        System.out.println("Saldo insuficiente");
    return objTransferencia;


}

    }

