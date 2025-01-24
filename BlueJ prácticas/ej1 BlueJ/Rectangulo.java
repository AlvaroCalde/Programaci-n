
/**
 * Write a description of class Rectangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangulo
{
   private float ancho;
   private float alto;
   
   public Rectangulo(float ancho, float alto){
       this.ancho=ancho;
       this.alto=alto;
   }
   
   public float getAncho(){
       return ancho;
   }
   
   public float getAlto(){
       return alto;
   }
   
   public void setAncho(float ancho){
       this.ancho=ancho;
   }
   
   public void setAlto(float alto){
       this.alto=alto;
   }
   
   public float calcularArea(){
      float area;
      area=ancho*alto;
      return area; 
   }
   
   public float calcularPerimetro(){
       float perimetro;
       perimetro=2*ancho + 2*alto;
       return perimetro;
   }
}
