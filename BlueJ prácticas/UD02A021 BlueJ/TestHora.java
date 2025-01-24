
/**
 * Write a description of class TestHora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class TestHora
{
   public static void main(String[] args){
       Scanner teclado=new Scanner(System.in);
       Hora hora1,hora2;
       int horas,minutos,segundos;
      
       System.out.println("Hora1");
       System.out.print("Introduzca las horas: ");
       horas=teclado.nextInt();
       System.out.print("Introduzca los minutos: ");
       minutos=teclado.nextInt();
       System.out.print("Introduzca los segundos: ");
       segundos=teclado.nextInt();
       
       hora1=new Hora(horas,minutos,segundos);
       
       System.out.println("Hora2");
       System.out.print("Introduzca las horas: ");
       horas=teclado.nextInt();
       System.out.print("Introduzca los minutos: ");
       minutos=teclado.nextInt();
       System.out.print("Introduzca los segundos: ");
       segundos=teclado.nextInt();
       
       hora2=new Hora(horas,minutos,segundos);
       
        public String toString(){
           String salida;
           
           salida=horas+"-"+minutos+"-"+segundos;
           
           return salida;
   }
   
       public int convertirASegundos(){
       
   }
 }


