package practice.tienda;

public class Dimension {
    double alto;
    double ancho;
    double profundidad;
    
    //Constructor

    public Dimension() {
        this.alto = 0;
        this.ancho = 0;
        this.profundidad = 0;
    }

    public Dimension(double alto, double ancho, double profundidad) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }
    
    // Getters & Setters
    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }
    
    // Metodos 
    
    public double getVolume(){
       return alto*ancho*profundidad;
        
    }

    @Override
    public String toString() {
        return "Dimension{" + "alto=" + alto + ", ancho=" + ancho + ", profundidad=" + profundidad + " volumen="+getVolume()+'}';
    }
    
    
    
    
    
}
