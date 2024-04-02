package practice.tienda;

public class Tienda {

    public static void main(String[] args) {
        
        //Superheores
        
        //DC COMICS
        Superheroe s1 = new Superheroe("Flash");
        Superheroe s2 = new Superheroe("Batman");
        s1.setBio("El hombre mas rapido del universo");
        s2.setBio("El senor de la noche");
        s2.setCapa(true);
        
        //MARVEL
        Superheroe s3 = new Superheroe("Spiderman");
        Superheroe s4 = new Superheroe("Iron Man");
        s3.setBio("El hombre araña");
        s4.setBio("El hombre de acero");
        
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());
        
        
        //Dimensiones
        Dimension d1 = new Dimension(10,8,5);
        Dimension d2 = new Dimension(14,12,7);
        Dimension d3 = new Dimension(9,7,4);
        Dimension d4 = new Dimension(10,10,6);
        
        System.out.println(d1.toString());
        
        
        // Figura
        Figura f1 = new Figura("4",39.99,s1,d1);
        System.out.println(f1.toString());
        Figura f2 = new Figura("6",59.99,s2,d2);
        System.out.println(f2.toString());
        Figura f3 = new Figura("8",29.99,s3,d3);
        System.out.println(f3.toString());
        Figura f4 = new Figura("10",44.99,s4,d4);
        System.out.println(f4.toString());
        
        f1.subirPrecio(15);
        System.out.println("La figura #1 Ahora tiene un costo de ="+f1.getPrecio());     
        
        
       // Colecciones       
       Coleccion c1 = new Coleccion("DC Comics");
       c1.añadirFigura(f1);
       c1.añadirFigura(f2);
       
       System.out.println(c1.toString());
       System.out.println(c1.conCapa());
       System.out.println("La figura mas valiosa de la coleccion es= "+c1.masValioso());
       System.out.println("El valor de la coleccion es ="+c1.getValorColeccion());
       System.out.println("El volumen de las figuras y sumandole 200 da= "+c1.getVolumenColeccion());    
    
    }
}
