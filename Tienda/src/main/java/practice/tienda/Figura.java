package practice.tienda;

public class Figura {
    String id;
    double precio;
    Superheroe superheroe;
    Dimension dimensiones;

    //Constructor
    public Figura(String id, double precio, Superheroe superheroe, Dimension dimensiones) {
        this.id = id;
        this.precio = precio;
        this.superheroe = superheroe;
        this.dimensiones = dimensiones;
    }

    //Getters & Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Superheroe getSuperheroe() {
        return superheroe;
    }

    public void setSuperheroe(Superheroe superheroe) {
        this.superheroe = superheroe;
    }

    public Dimension getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(Dimension dimensiones) {
        this.dimensiones = dimensiones;
    }
    
    
    //Metodos
    @Override
    public String toString() {
        return "Figura" + " id=" + id + " precio=" + precio + " \n superheroe=" + superheroe + " \n dimensiones=" + dimensiones;
    }
    
    public void subirPrecio(double cantidad){
         precio += cantidad;
    }
    
}
