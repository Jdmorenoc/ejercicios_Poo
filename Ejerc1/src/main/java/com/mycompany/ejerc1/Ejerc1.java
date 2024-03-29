package com.mycompany.ejerc1;

import java.util.ArrayList;

// PRIMERA CLASE
class Superheroe {
    private String nombre;
    private String descripcion;
    private boolean capa;

    public Superheroe(String nombre) {
        this.nombre = nombre;
        this.descripcion = "";
        this.capa = false;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCapa() {
        return capa;
    }

    public void setCapa(boolean capa) {
        this.capa = capa;
    }

    // Método toString
    @Override
    public String toString() {
        return "Superheroe{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", capa=" + capa +
                '}';
    }
}

// SEGUNDA CLASE
class Dimension {
    private double alto;
    private double ancho;
    private double profundidad;

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

    // Getters y setters
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

    // Método de cálculo
    public double getVolumen() {
        return alto * ancho * profundidad;
    }

    // Método toString
    @Override
    public String toString() {
        return "Dimension{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                ", profundidad=" + profundidad +
                ", volumen=" + getVolumen() +
                '}';
    }
}

// TERCERA CLASE
class Figura {
    private String codigo;
    private double precio;
    private Superheroe superheroe;
    private Dimension dimensiones;

    public Figura(String codigo, double precio, Superheroe superheroe, Dimension dimensiones) {
        this.codigo = codigo;
        this.precio = precio;
        this.superheroe = superheroe;
        this.dimensiones = dimensiones;
    }

    // Getters y setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    // Método toString
    @Override
    public String toString() {
        return "Figura{" +
                "codigo='" + codigo + '\'' +
                ", precio=" + precio +
                ", superheroe=" + superheroe +
                ", dimensiones=" + dimensiones +
                '}';
    }

    // Método modificador adicional
    public void subirPrecio(double cantidad) {
        precio += cantidad;
    }
}

//CUARTA CLASE
class Coleccion {
    private String nombreColeccion;
    private ArrayList<Figura> listaFiguras;

    public Coleccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
        this.listaFiguras = new ArrayList<>();
    }

    // Getters y setters
    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    // Método para añadir figura a la colección
    public void añadirFigura(Figura fig) {
        listaFiguras.add(fig);
    }

    // Método para subir precio de una figura
    public void subirPrecio(double cantidad, String id) {
        for (Figura figura : listaFiguras) {
            if (figura.getCodigo().equals(id)) {
                figura.subirPrecio(cantidad);
                break;
            }
        }
    }

    // Método toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Colección: ").append(nombreColeccion).append("\n");
        for (Figura figura : listaFiguras) {
            sb.append(figura).append("\n");
        }
        return sb.toString();
    }

    // Método para obtener figuras con capa
    public String conCapa() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figuras con capa en la colección ").append(nombreColeccion).append(":\n");
        for (Figura figura : listaFiguras) {
            if (figura.getSuperheroe().isCapa()) {
                sb.append(figura).append("\n");
            }
        }
        return sb.toString();
    }

    // Método para obtener la figura más valiosa
    public Figura masValiosa() {
        Figura masValiosa = null;
        double maxPrecio = Double.MIN_VALUE;
        for (Figura figura : listaFiguras) {
            if (figura.getPrecio() > maxPrecio) {
                maxPrecio = figura.getPrecio();
                masValiosa = figura;
            }
        }
        return masValiosa;
    }

    // Método para obtener el valor total de la colección
    public double getValorColeccion() {
        double valorTotal = 0;
        for (Figura figura : listaFiguras) {
            valorTotal += figura.getPrecio();
        }
        return valorTotal;
    }

    // Método para obtener el volumen total de la colección
    public double getVolumenColeccion() {
        double volumenTotal = 200; // Se añade 200 por defecto
        for (Figura figura : listaFiguras) {
            volumenTotal += figura.getDimensiones().getVolumen();
        }
        return volumenTotal;
    }
}

// CLASE PRINCIPAL "MAIN"
public class Ejerc1 {
    public static void main(String[] args) {
        // Crear superhéroes
        Superheroe batman = new Superheroe("Batman");
        batman.setDescripcion("Hombre murciélago");
        batman.setCapa(true);

        Superheroe superman = new Superheroe("Superman");
        superman.setDescripcion("Hombre de acero");
        superman.setCapa(true);

        // Crear dimensiones
        Dimension dimBatman = new Dimension(10, 5, 3);
        Dimension dimSuperman = new Dimension(12, 6, 4);

        // Crear figuras
        Figura figura1 = new Figura("001", 15.99, batman, dimBatman);
        Figura figura2 = new Figura("002", 19.99, superman, dimSuperman);

        // Crear colección
        Coleccion coleccion = new Coleccion("DC Comics");
        coleccion.añadirFigura(figura1);
        coleccion.añadirFigura(figura2);

        // Mostrar información de la colección
        System.out.println(coleccion);

        // Subir precio de una figura
        coleccion.subirPrecio(5, "001");

        // Mostrar figura más valiosa
        System.out.println("Figura más valiosa:");
        System.out.println(coleccion.masValiosa());

        // Mostrar valor total de la colección
        System.out.println("Valor total de la colección: $" + coleccion.getValorColeccion());

        // Mostrar volumen total de la colección
        System.out.println("Volumen total de la colección: " + coleccion.getVolumenColeccion() + " cm³");

        // Mostrar figuras con capa
        System.out.println(coleccion.conCapa());
    }
}
