
/**
 * Write a description of class Prueba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prueba
{
  public static void main(String[] args){
      Cuenta cuenta1=null;
      Cuenta cuenta2=null;
      float saldo;
      
      cuenta1=new Cuenta("ABC","Alvaro",48);
      
      saldo=cuenta1.getSaldo();
      
      System.out.println(saldo);
     
      cuenta1.ingresar(500);
     
      saldo=cuenta1.getSaldo();
     
      System.out.println(saldo);
  }
}
