package entity;

import java.util.List;

public  class Cuenta {

    private String numCta;
    private double saldo ;
    private Cliente cliente;
    private int sucursal;
    private List<Transferencia> transferencias;

    public Cuenta() {
    }



    public Cuenta(String numCta, double saldo, Cliente cliente, int sucursal, List<Transferencia> transferencias) {
        this.numCta = numCta;
        this.saldo = saldo;
        this.cliente = cliente;
        this.sucursal = sucursal;
        this.transferencias = transferencias;
    }

    public int getSucursal() {
        return sucursal;
    }

    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
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
               ", cliente=" + cliente +
                ", transferencias=" + transferencias +
                '}';
    }
}
