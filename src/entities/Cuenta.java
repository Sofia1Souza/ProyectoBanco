package entities;

import java.util.ArrayList;
import java.util.List;

public  class Cuenta {

    private String numCta;
    private double saldo ;
    private Cliente cliente;
    private int numSucursal;
    private List<Transferencia> transferencias =new ArrayList();

    public Cuenta() {
    }

    public Cuenta(String numCta, double saldo, Cliente cliente, int sucursal) {
        this.numCta = numCta;
        this.saldo = saldo;
        this.cliente = cliente;
        this.numSucursal = sucursal;
    }

    public int getNumSucursal() {
        return numSucursal;
    }

    public void setNumSucursal(int numSucursal) {
        this.numSucursal = numSucursal;
    }

    public String getNumCta() {
        return numCta;
    }

    public void setNumCta(String numCta) {
        this.numCta = numCta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Transferencia> getTransferencias() {
        return transferencias;
    }

    public void setTransferencias(List<Transferencia> transferencias) {
        this.transferencias = transferencias;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numCta='" + numCta + '\'' +
                ", saldo=" + saldo +
               //", cliente=" + cliente +
                ", transferencias=" + transferencias +
                '}';
    }
}
