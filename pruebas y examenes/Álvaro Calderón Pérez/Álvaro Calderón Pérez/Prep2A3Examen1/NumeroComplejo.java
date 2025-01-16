
/**
 * Write a description of class NumeroComplejo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumeroComplejo
{
    private float parteReal;
    private float parteImaginaria;
    
    public NumeroComplejo(){
    
    }
    
    public NumeroComplejo(float parteReal, float parteImaginaria){
    
    }
    
    public float getParteReal() {
        return parteReal;
    }

    public float getParteImaginaria() {
        return parteImaginaria;
    }

    public void setParteReal(float parteReal) {
        this.parteReal = parteReal;
    }

    public void setParteImaginaria(float parteImaginaria) {
        this.parteImaginaria = parteImaginaria;
    }
    
    public NumeroComplejo sumar(NumeroComplejo z){
        NumeroComplejo sumar;
        float parteImaginariaSuma;
        float parteRealSuma;
        
        parteRealSuma=parteReal + this.parteReal;
        parteImaginariaSuma=parteImaginaria + this.parteImaginaria;
        
        sumar=parteRealSuma+","+ parteImaginariaSuma;
        return sumar;
    }
}
