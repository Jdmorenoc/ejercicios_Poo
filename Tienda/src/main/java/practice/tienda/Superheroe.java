package practice.tienda;

public class Superheroe {
    String nombre;
    String bio;
    boolean capa;

    //CONSTRUCTOR
    public Superheroe(String nombre) {
        this.nombre = nombre;
        this.bio = "";
        this.capa = false;
    }
    
    
    //GETTERS & SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public boolean isCapa() {
        return capa;
    }

    public void setCapa(boolean capa) {
        this.capa = capa;
    }

    public Superheroe() {
    }
    
    @Override
    public String toString(){
        String cadena = "Sus propiedades son [1.Nombre:"+ nombre + " 2.Descripcion:"+bio+ " 3.Capa:"+capa;
        return cadena;
    }
    
}
