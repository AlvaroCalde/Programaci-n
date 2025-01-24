/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contacto;
import java.util.Scanner;
/**
 *
 * @author alvaro.calper
 */
public class AppAgenda {
    public static void mains(String[] args){
        Contacto contacto=null;
        String nombre,telefono,email;        
        int opcion;
        Agenda agenda;
        Scanner teclado=new Scanner(System.in);
        agenda=new Agenda();
        
        do{
            System.out.println("1.- Crear contacto");
            System.out.println("2.- Consultar contacto");
            System.out.println("3.- Modificar contacto");
            System.out.println("4.- Eliminar contacto");
            opcion=teclado.nextInt();
            teclado.nextLine();
            if(opcion>=1 && opcion<=4){
                System.out.println("Introduzca el datos del contacto");
                    nombre=teclado.nextLine();
                    telefono=teclado.nextLine();
                    email=teclado.nextLine();
                        if(opcion==1){    
                                if(contacto==null){
                                    System.out.println("Introduzca el nombre");
                                    nombre=teclado.nextLine();
                                    System.out.println("Introduzca el teléfono");
                                    telefono=teclado.nextLine();
                                    System.out.println("Introduzca el email");
                                    email=teclado.nextLine();
                                    teclado.nextLine();
                                    contacto=new Contacto(nombre,telefono,email);
                                    System.out.println("Contacto creado");
                                }
                                else{
                                    System.out.println("No se puede crear el contacto");
                                }
                        }
                else{                     
                         switch(opcion){                           
                             case 2 -> {
                                 if(contacto!=null && nombre.equals(contacto.getNombre())){
                                    System.out.println("Nombre: "+ nombre);
                                    System.out.println("Teléfono: "+ telefono);
                                    System.out.println("Email: "+ email);
                                 }
                             }
                             case 3 -> {       
                                     System.out.println("Introduzca nombre contacto");
                                     nombre=teclado.nextLine();
                                     if(contacto!=null && nombre.equals(contacto.getNombre())){
                                        System.out.println("Introduzca nuevo nombre"); 
                                        contacto.setNombre(nombre);
                                        System.out.println("Introduzca nuevo teléfono"); 
                                        contacto.setTelefono(telefono);
                                        System.out.println("Introduzca nuevo email"); 
                                        contacto.setEmail(email);
                                 }
                             }
                             case 4 -> {
                                    nombre=null;
                                    telefono=null;
                                    email=null;
                                    System.out.println("Contacto eliminado");
                             }
                            
                        }
                                
                     }
                }                     
        
        } while (opcion !=0);                        
    }
}
