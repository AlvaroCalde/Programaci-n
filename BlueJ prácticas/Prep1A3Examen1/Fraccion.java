
/**
 * Write a description of class Fraccion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fraccion
{
   private int numerador;
   private int denominador;
   
   public Fraccion(){
        this.numerador=1;
        this.denominador=1;
    }
   public Fraccion(int numerador, int denominador){
        this.numerador=numerador;
        this.denominador=denominador;
    }
    public int getNumerador(){
       return numerador;
   }
   public int getDenominador(){
        return denominador;
    }
   public void setNumerador(int numerador){
        this.numerador=numerador;
   }
   public void setDenominador(int denominador){
        this.denominador=denominador;
    }
   public int sumar(int otraFraccion, int Fraccion){
        int suma;
        Fraccion=numerador/denominador;
        otraFraccion=numerador/denominador;
        suma=Fraccion+otraFraccion;
        return suma;
    }
   public int multiplicar(int otraFraccion, int Fraccion){
        int multiplicacion;
        Fraccion=numerador/denominador;
        otraFraccion=numerador/denominador;
        multiplicacion=otraFraccion*Fraccion;
        return multiplicacion;
    }
   public String toString(){
        String fraccion;
        fraccion=numerador+"/"+denominador;
        return fraccion;
    }
    
    
}

