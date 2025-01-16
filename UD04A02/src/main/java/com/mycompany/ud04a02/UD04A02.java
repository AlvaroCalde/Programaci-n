/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ud04a02;
import java.util.Scanner;
/**
 *
 * @author alvaro.calper
 */
public class UD04A02 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int opcion, entero;
        String cadena1, cadena2;
        do{            
            System.out.println("Introduzca opción");
            opcion=teclado.nextInt();
            teclado.nextLine();
            switch(opcion){
                case 1 -> {
                    System.out.println(System.getProperty("os.name"));
                }
                case 2 -> {
                
                    System.out.println("Introduzca la primera cadena: ");
                    cadena1=teclado.nextLine();
                    System.out.println("Introduzca la segunda cadena: ");
                    cadena2=teclado.nextLine();

                    entero=cadena1.compareToIgnoreCase(cadena2);
                    if(entero<0){
                        System.out.println(cadena1);
                        System.out.println(cadena2);

                    }else{
                        System.out.println(cadena2);
                        System.out.println(cadena1);
                    }
                }
                case 3 -> {
                    
                    System.out.println("Introduzca la primera cadena: ");
                    cadena1=teclado.nextLine();
                    System.out.println("Introduzca la segunda cadena: ");
                    cadena2=teclado.nextLine();
                    
                    if(cadena1.startsWith(cadena2) && cadena1.endsWith(cadena2)){
                        System.out.println("ES PREFIJO Y SUFIJO");
                    }else{
                        if(cadena1.startsWith(cadena2)){
                            System.out.println("ES PREFIJO");
                        }else{
                            if(cadena1.endsWith(cadena2)){
                                System.out.println("ES SUFIJO");
                            }else{
                                System.out.println("NO ES NI PREFIJO NI SUFIJO");
                            }
                        }
                    }
                }
                case 4 -> {
                    
                     System.out.println("Introduzca la primera cadena: ");
                    cadena1=teclado.nextLine();
                    System.out.println("Introduzca la segunda cadena: ");
                    cadena2=teclado.nextLine();
                    
                    entero=cadena2.indexOf(cadena1);
                    if(entero==-1){
                        System.out.println("No se encontró");
                    }else{                       
                        System.out.println("Se encontró y fue en "+ cadena2.lastIndexOf(cadena1));
                    }
                }
                case 5 -> {
                    System.out.println("Introduzca la cadena: ");
                    cadena1=teclado.nextLine();
                    
                    System.out.println(cadena1.toUpperCase());
                }
                case 6 -> {
                    System.out.println("Introduzca la cadena: ");
                    cadena1=teclado.nextLine();
                    
                    System.out.println(cadena1.replace(" ","_"));
                }
                case 7 -> {
                    System.out.println("Introduzca la cadena: ");
                    cadena1=teclado.nextLine();
                    System.out.println("Introduzca el número entero positivo: ");
                    entero=teclado.nextInt();
                    
                    System.out.println(cadena1.repeat(entero));
                }
                case 8 -> {
                    System.out.println("Introduzca el DNI (8 dígitos): ");
                    entero=teclado.nextInt();
                    
                }
                case 9 -> {
                    StringBuilder cad1, cad2;
                    System.out.println("Introduzca la primera cadena: ");
                    cadena1=teclado.nextLine();
                    System.out.println("Introduzca la segunda cadena: ");
                    cadena2=teclado.nextLine();
                    System.out.println("Introduzca la posición donde insertar (número): ");
                    entero=teclado.nextInt();
                                        
                    cad1=new StringBuilder(cadena1);
                    cad2=new StringBuilder(cadena2);
                    System.out.println(cad1.insert(entero, cad2));
                }
                case 10 -> {
                    StringBuilder cad1;
                    System.out.println("Introduzca una palabra (en minúsculas): ");
                    cadena1=teclado.nextLine();
                    
                    cad1=new StringBuilder(cadena1);
                    System.out.println(cadena1+" "+cad1.reverse());                   
                }
                case 11 -> {
                    float radio;
                    System.out.println("Introduzca el radio: ");
                    radio=teclado.nextFloat();
                    
                    System.out.println(radio*(Math.PI*Math.PI));
                }
                case 12 -> {
                    int a, b, c;
                    float s;
                    System.out.println("Introduzca el primer lado: ");
                    a=teclado.nextInt();
                    System.out.println("Introduzca el segundo lado: ");
                    b=teclado.nextInt();
                    System.out.println("Introduzca el tercer lado: ");
                    c=teclado.nextInt();
                    s=(a+b+c)/2;
                    
                    System.out.println(Math.pow((float)s*(s-a)*(s-b)*(s-c),1/2));
                    
                }
                case 13 -> {
                    
                    System.out.println("Introduzca una palabra (en minúsculas): ");
                    cadena1=teclado.nextLine();
                    
                    
                    
                   System.out.println();
                }
                case 14 -> {                    
                    System.out.println("Introduzca un número entero positivo: ");
                    entero=teclado.nextInt();
                                       
                    System.out.println(Integer.toBinaryString(entero));
                    System.out.println(Integer.toHexString(entero));
                }
                case 0 -> {
                    System.out.println("BYE");
                }
                default -> {
                    System.out.println("Error en la entrada");
                }
            }          
        }while(opcion!=0);
    }
}
