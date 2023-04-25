package service;

import entities.Banco;
import entities.Cliente;


import java.util.ArrayList;
import java.util.List;

public class BancoService {
    List<Cliente> clientes = new ArrayList();
    List<Banco> bancos = new ArrayList();

    public void crearBanco(List<Banco>bancos) {

        Banco objBanco1 = new Banco();
        objBanco1.setNumSucursal(1);
        objBanco1.setDireccion("Av Saez Peña Cap Fed Argentina");
        bancos.add(objBanco1);



        Banco objBanco2= new Banco();
        objBanco2.setNumSucursal(2);
        objBanco2.setDireccion("Maldonado 1024 Montevideo Uruguay");
        bancos.add(objBanco2);

    }

     public void mostrarBanco(List<Banco>bancos){
         System.out.println("Se han generado las sucursales y clientes:");
         for (Banco banco:bancos) {
             System.out.print( "Sucursal:" +banco.getNumSucursal());
             System.out.print(" ");
             System.out.print("Banco:"+banco.getDireccion());
             System.out.println(" ");

         }
     }

    public Cliente agregarCliente1(List <Cliente> clientes) {
        Cliente cliente1 = new Cliente("Julia","Nandez","34567892");
        clientes.add(cliente1);
        return cliente1;

    }public Cliente agregarCliente2(List <Cliente> clientes) {
        Cliente cliente2 = new Cliente("Marcos","Funes","32123987");
        clientes.add(cliente2);
        return cliente2;

    }


        public void mostrarCliente(List<Cliente>clientes) {
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }

        }


    }





