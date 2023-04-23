package service;

import entities.Banco;
import entities.Cuenta;
import entities.Transferencia;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TransferenciaService {
    BancoService objBancoService = new BancoService();

    public void hacerTransferencia(Cuenta cuentaOrigen, Cuenta cuentaDestino, double monto) {

        if (cuentaOrigen.getSaldo() >= monto) {
            cuentaOrigen.setSaldo(cuentaOrigen.getSaldo() - monto);
            cuentaDestino.setSaldo(cuentaDestino.getSaldo() + monto);

            int numTransferencia = new Random().nextInt(100) + 1;
            Transferencia objTransferencia = new Transferencia(numTransferencia, cuentaOrigen, cuentaDestino, monto);
            List<Transferencia> transferencias = cuentaOrigen.getTransferencias();
            transferencias.add(objTransferencia);
        } else {
            System.out.println("Saldo insuficientes");
        }


    }


}