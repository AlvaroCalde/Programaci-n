/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ud04a03;
import java.text.NumberFormat;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.Locale;
import java.util.TimeZone;
/**
 *
 * @author alvaro.calper
 */
public class UD04A03 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int opcion, n;
        int acumulador, contador;
        int dia, mes, anyo;
        String cadena, mesEnLetra, codigoPais, codigoIdioma;
        StringTokenizer st;
        float precio;
        do{
            System.out.println("1- Calcula la media");
            System.out.println("2- Adivina el número");
            System.out.println("3- Dividir cadena");
            System.out.println("4- Leer fecha y mostrar formateada");
            System.out.println("5- Unir palabras separadas por delimitador");
            System.out.println("6- Mostrar la configuración regional y la zona horaria");
            System.out.println("7- Cambiar la configuración regional");
            System.out.println("8- Cambiar la zona horaria");
            System.out.println("9- Mostrar información en distintos formatos");
            System.out.println("0- Salir");
            System.out.println("Introduzca opción");
            opcion=teclado.nextInt();
            teclado.nextLine();
            switch(opcion){
                case 1 -> {
                    acumulador=0;
                    contador=0;
                    
                    n=leerEntero("Introduzca entero");
                    
                    while(n>=0){
                        acumulador+=n;
                        contador++;
                        n=leerEntero("Introduzca entero: ");
                        
                    }
                    if(contador!=0){
                        System.out.println("la media es: "+acumulador/contador);                      
                    }
                    else{
                        System.out.println("Error en la entrada");
                    }
                }
                case 2 -> {
                    contador=0;
                    Random aleatorio=new Random();
                    n=aleatorio.nextInt(100);
                    contador++;
                                       
                    System.out.println(n);
                    System.out.println("Intentos necesitados: "+contador);
                }
                case 3 -> {
                    System.out.println("Introduzca la cadena: ");
                    cadena=teclado.nextLine();
                    st=new StringTokenizer(cadena);
                    while(st.hasMoreTokens()){
                        System.out.println(st.countTokens());
                        System.out.println(st.nextToken());
                    }
                }
                case 4 -> {
                    System.out.println("Introduzca fecha (dd-mm-aaaa): ");
                    cadena=teclado.nextLine();
                    st=new StringTokenizer(cadena,"-");
                    if(st.countTokens()==3){
                        dia=Integer.parseInt(st.nextToken());
                        mes=Integer.parseInt(st.nextToken());
                        anyo=Integer.parseInt(st.nextToken());
                        
                        mesEnLetra=switch(mes){
                            case 1 -> "enero";
                            case 2 -> "febrero";
                            default -> "error";
                        };
                        System.out.println(dia+" de "+mesEnLetra+" de "+anyo);
                    }
                }
                case 5 -> {
                    StringJoiner sj = new StringJoiner(",", "[", "]");
                    System.out.println("Introduzca la cadena (FIN para salir)");
                    cadena=teclado.nextLine();
                    while(!cadena.equals("FIN")){
                        sj.add(cadena);
                        System.out.println("Introduzca la cadena (FIN para salir)");
                        cadena=teclado.nextLine();
                    }
                }
                case 6 -> {
                    System.out.println("Configuración regional: "+Locale.getDefault());
                    System.out.println("zona horaria: "+TimeZone.getDefault());
                }
                case 7 -> {
                    System.out.println("Código de país: ");
                    codigoPais=teclado.nextLine();
                    System.out.println("Código de idioma: ");
                    codigoIdioma=teclado.nextLine();
                    
                    Locale.setDefault(Locale.of(codigoIdioma,codigoPais));
                    System.out.println("País: "+Locale.getDefault().getDisplayCountry());
                    System.out.println("Idioma: "+Locale.getDefault().getDisplayLanguage());
                }
                case 8 -> {
                    System.out.println("Introduzca la zona horaria");
                    cadena=teclado.nextLine();
                    
                    TimeZone.getDefault().setID(cadena);
                    TimeZone.setDefault(TimeZone.getTimeZone(cadena));
                    System.out.println(LocalTime.now());
                }
                case 9 -> {
                    NumberFormat nf = NumberFormat.getInstance(Locale.getDefault());
                    System.out.println("Introduzca precio: ");
                    precio=teclado.nextFloat();
                    System.out.println(nf.format(precio)+nf.getCurrency());
                    
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
    private static int leerEntero(String mensaje){
        int entero;
        Scanner teclado=new Scanner(System.in);
        System.out.print(mensaje);
        while(!teclado.hasNextInt()){
            teclado.nextLine();
        }
        entero=teclado.nextInt();
        
        return entero;
    }
   
}
