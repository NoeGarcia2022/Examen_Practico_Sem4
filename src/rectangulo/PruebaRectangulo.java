package rectangulo;

import java.util.Scanner;

public class PruebaRectangulo {
    public static void main(String[] args) {
       Rectangulo rec = new Rectangulo();
       
       //rec.setAnchura(10);
       //rec.setLongitud(6);
       
       Scanner leer = new Scanner(System.in);
        System.out.println("****INGRESAR DOS NUMEROS PARA CALCULAR EL PERIMETRO DE UN RECTANGULO****");
        System.out.println("Ingrese un numero: ");
        rec.setAnchura(leer.nextDouble());
        
        System.out.println("Ingrese un numero: ");
        rec.setLongitud(leer.nextDouble());
        
        System.out.println("****************RESULTADO****************");
        System.out.println("El perimetro del rectangulo es: " + rec.calcularPerimetro() + "cm");
        System.out.println("El area del rectangulo es: " + rec.calcularArea() + "cm");
    }
}
