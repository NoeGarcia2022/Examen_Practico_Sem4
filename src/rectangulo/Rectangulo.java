/*En un paquete rectangulo, cree una clase llamada Rectangulo con los atributos longitud y
anchura, cada uno con valor predeterminado de 1. Debe tener métodos para calcular el
perímetro y el área del rectángulo. Debe tener métodos para establecer (set) y obtener (get)
la longitud y la anchura. Los métodos establecer deben verificar que longitud y anchura sean
números de punto flotante mayores que 0.0 y menores que 20.0.
Agregue la clase PruebaRectangulo para probar la clase Rectangulo.*/
package rectangulo;

public class Rectangulo {

    private double longitud;
    private double anchura;
    
    public Rectangulo(double longitud, double anchura) {
        this.longitud = 1;
        this.anchura = 1;
    }
    Rectangulo() {
        
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        if (longitud > 0.00 && longitud < 20.0) {
        this.longitud = longitud;
        }   
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        if (anchura > 0.00 && longitud < 20.0){
        this.anchura = anchura;
        }else{
            System.out.println("La anchura debe ser > 0 < 20.0");
        }
    }

    double calcularPerimetro() {
        double perimetro = (2 * anchura) + (2 * longitud);
    return perimetro;
    }

    double calcularArea() {
        double area = (anchura * longitud);
    return area;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
