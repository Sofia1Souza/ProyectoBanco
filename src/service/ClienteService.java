package service;

import entity.Cliente;

import java.util.Scanner;

public class ClienteService {

 public  Cliente CrearCliente(){

     Scanner leer= new Scanner(System.in);
     Cliente cliente= new Cliente();
     CuentaService objCuentaService= new CuentaService();

     System.out.println("Ingrese su nombre");
     cliente.setNombre(leer.nextLine());
     System.out.println("Ingrese su apellido");
     cliente.setApellido(leer.nextLine());
     System.out.println("Ingrese su dni");
     cliente.setDni(leer.nextLine());

     System.out.println("Elija la sucursal con la que desea operar");
     int sucursal= leer.nextInt();
  // validar opciones
     if(sucursal==1 || sucursal==2){
         cliente.setCuenta(objCuentaService.crearCuenta(cliente,sucursal));
         System.out.println("Ha generado su cuenta correctamente");
     }else {
         System.out.println("Opción invalida");
     }

     System.out.println(cliente.getCuenta());

     return cliente;
 }

}
