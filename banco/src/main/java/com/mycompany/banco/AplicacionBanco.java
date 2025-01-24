/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.banco;
import java.util.Scanner;
/**
 *
 * @author alvaro.calper
 */
public class AplicacionBanco {

    public static void main(String[] args) {
        Cuenta cuenta=null;
        int opcion;
        Scanner teclado=new Scanner(System.in);
        String codigo;
        float saldo,cantidad;
        String titular;
        do{
        System.out.println("1.-Abrir cuenta");
        System.out.println("2.-Ingresar dinero");
        System.out.println("3.-Retirar cuenta");
        System.out.println("4.-Consultar saldo");
        System.out.println("5.-Cancelar cuenta");
        System.out.println("0.-ASalir");
        opcion=teclado.nextInt();
        teclado.nextLine();
         switch (opcion){
            case 1 -> {
                 System.out.println("Introduzca el titular");
                            titular=teclado.nextLine();
                            System.out.println("Introduzca el saldo");
                            saldo=teclado.nextFloat();
                            teclado.nextLine();
                            cuenta=new Cuenta(codigo,titular,saldo);
                            System.out.println("Cuenta creada");
            case 2 -> {
                System.out.println("Introduzca cantidad a ingresar");
                cantidad=teclado.nextFloat();
                teclado.nextLine();
                                    cuenta.ingresar(cantidad);
                                    System.out.println("Cantidad ingresada");
                                    System.out.println("Nuevo saldo: " + cuenta.getSaldo());                                  
                            }                }   
                                            

                            
                            case 3 -> {

                                    System.out.println("Introduzca cantidad a retirar");
                                    cantidad=teclado.nextFloat();
                                    teclado.nextLine();
                                    cuenta.ingresar(cantidad);
                                    System.out.println("Cantidad ingresada");
                                    System.out.println("Nuevo saldo: " + cuenta.getSaldo());                 
                            } 
                            case  4 -> {

                                System.out.println(cuenta.getSaldo());   
                            }
                            case 5 -> {
                                cuenta=null;
                                System.out.println("Cuenta cancelada");
                            } 
                        }                              
        
        
                
            
        
        
                
                                    
            
        
    


