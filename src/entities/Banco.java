package entities;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private int numSucursal;
    private String direccion;
    private List<Cliente> clientes;
    private List<Cuenta> cuentas;

    public Banco() {
        cuentas=new ArrayList<Cuenta>();
        clientes=new ArrayList<Cliente>();
    }

    public Banco(int numSucursal, String direccion, List<Cliente> clientes, List<Cuenta> cuentas) {
        this.numSucursal = numSucursal;
        this.direccion = direccion;
        this.clientes = clientes;
        this.cuentas = cuentas;
    }

    public int getNumSucursal() {
        return numSucursal;
    }

    public void setNumSucursal(int numSucursal) {
        this.numSucursal = numSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }


    @Override
    public String toString() {
        return  "\n"+"Banco Bross{" +
                "NumSucursal=" + numSucursal +
                ", Direccion='" + direccion + '\'' +
                ", clientes=" + clientes +
                ", cuentas=" + cuentas +
                '}';
    }
}

