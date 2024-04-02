package practice.tienda;

import java.util.ArrayList;

public class Coleccion {
    String nombreColeccion;
    ArrayList<Figura> listaFiguras;

    // Constructor
    public Coleccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
        listaFiguras = new ArrayList<>(); 
    }

    //Getters & Setters
    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    //Metodos
    public void añadirFigura(Figura fig){
        listaFiguras.add(fig);
    }    
    
    public void subirPrecio(double cantidad, String id){
        for(Figura f:listaFiguras){
            if(f.getId().equals(cantidad)) {
               f.subirPrecio(cantidad);
           }           
        }
    }    

    @Override
    public String toString() {
        String cadena = "Coleccion "+nombreColeccion+ "\n ------------ \n";
        
        for(Figura f: listaFiguras){
            cadena += f+"\n";            
        } 
        return cadena;
    }
    
    public String conCapa(){
        String cadena = "Las figuras que tienen capa en la coleccion son= \n" ;
        for (Figura f: listaFiguras){
            if(f.getSuperheroe().isCapa()){
                cadena += f+"\n";                
            } 
        }return cadena;
    }
    
    public Figura masValioso(){
        double precioMayor = 0.0;
        Figura fMayor = null;
        
        for(Figura f:listaFiguras){
            if(f.getPrecio()>precioMayor){
                precioMayor = f.getPrecio();
                fMayor = f;
            }
        }return fMayor;
    }
    
    public double getValorColeccion(){
        double precioT = 0;
        for(Figura f: listaFiguras){
            precioT += f.getPrecio();
        }
        return precioT;
    }
    
    public double getVolumenColeccion(){
        double volumenCol = 0;
        
        for(Figura f: listaFiguras){
            volumenCol += f.getDimensiones().getVolume();            
        }
        return volumenCol+200;
    }
    
}
