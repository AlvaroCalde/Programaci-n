/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ud04a04;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


/**
 *
 * @author alvaro.calper
 */
public class UD04A04 {

    public static void main(String[] args) {
         Scanner teclado=new Scanner(System.in);
         int opcion,dia,mes,anyo;
         int fecha1,diaASumar,fecha3,fecha2;
         int h,min,s;
         String entrada;     
         do{
            System.out.println("1- Mostrar fecha y hora");
            System.out.println("2- Fecha y hora en dos zonas horarias");
            System.out.println("3- Sumar días a fechas");
            System.out.println("4- Menor de dos fechas");
            System.out.println("5- Sumar minutos a una hora");
            System.out.println("6- Hora anterior o posterior");
            System.out.println("7- Diferencia entre dos fechas");
            System.out.println("8- Diferencia entre dos horas");
            System.out.println("9- Llegada de un vuelo");
            System.out.println("10- Número de vocales de una cadena");
            System.out.println("11- Iniciales de nombre y apellidos");
            System.out.println("12- Información sobre ficheros y directorios");
            System.out.println("0- Salir");
            System.out.println("Introduzca opción");
            opcion=teclado.nextInt();
            teclado.nextLine();
            switch(opcion){
                case 1 -> {
                    entrada=LocalDateTime.now().format(DateTimeFormatter.ISO_DATE);
                    System.out.println(entrada);
                }
                case 2 -> {
                    System.out.println("Introduzca la zona horaria");
                    entrada=teclado.nextLine();
                   
                    
                    System.out.println(ZoneId.of(entrada));
                    
                }
                case 3 -> {
                    System.out.println("Introduzca la fecha (aaaa-mm-dd)");
                    fecha1=teclado.nextInt();
                    
                    System.out.println("Introduzca dias a sumar");
                    diaASumar=teclado.nextInt();
                    
                    
               
                  
                }
                case 4 -> {
                   System.out.println("Introduzca una fecha (dd-mm-aaaa): ");
                   fecha3=teclado.nextInt();
                   System.out.println("Introduzca otra fecha (dd-mm-aaaa): ");
                   fecha2=teclado.nextInt();
                   
                   
                }
                case 5 -> {
                   System.out.println("Introduzca la fecha (aaaa-mm-dd)");
                   fecha1=teclado.nextInt();
                    
                   System.out.println("Introduzca dias a sumar");
                   diaASumar=teclado.nextInt();
                    
                    
                }
                case 6 -> {
                    System.out.println("Introduzca las horas: ");
                    h=teclado.nextInt();
                    System.out.println("Introduzca los minutos: ");
                    min=teclado.nextInt();
                    System.out.println("Introduzca los segundos: ");
                    s=teclado.nextInt();
                    
                    LocalTime hora=LocalTime.of(h, min,s);
                    
                    
                    
                    System.out.println();
                    
                }

                case 7 -> {
                    System.out.println("Introduzca el dia: ");
                    dia=teclado.nextInt();
                    System.out.println("Introduzca el mes: ");
                    mes=teclado.nextInt();
                    System.out.println("Introduzca el año: ");
                    anyo=teclado.nextInt();
                    
                    LocalDate fecha;
                    fecha =LocalDate.of(anyo,mes,dia);
                    
                    Period p= Period.between(LocalDate.now(),fecha);
                    System.out.println(p);
                }

                case 8 -> {
                   
                    
                    
                    
                    
                }
                case 9 -> {
                   
                    
                    
                    
                    
                    
                }
                case 10 -> {
                    System.out.println("Introduzca una cadena: ");
                    entrada=teclado.nextLine();
                    
                }
                case 11 -> {}
                case 12 -> {}
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
