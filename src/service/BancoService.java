package service;

import entities.Banco;
import entities.Cliente;
import entities.Cuenta;

import java.util.ArrayList;
import java.util.List;

public class BancoService {
    List<Cliente> clientes = new ArrayList();
    List<Banco> bancos = new ArrayList<Banco>();

    ClienteService objClienteService = new ClienteService();

    public void crearBanco(int sucursal, String direccion) {

        Banco objBanco = new Banco();
        objBanco.setNumSucursal(sucursal);
        objBanco.setDireccion(direccion);

        bancos.add(objBanco);


    }

     public void mostrarBanco(){
         System.out.println("Se han generado las sucursales y clientes:");
         for (Banco banco:bancos) {
             System.out.print( "Sucursal:" +banco.getNumSucursal());
             System.out.print(" ");
             System.out.print("Banco:"+banco.getDireccion());
             System.out.println("");

         }
     }

    public Cliente agregarCliente(String nombre, String apellido, String dni) {
        Cliente cliente = objClienteService.CrearCliente(nombre, apellido, dni);
        clientes.add(cliente);
        return cliente;

    }

        public void mostrarCliente() {
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }

        }


    }





