package ejercicio2;

public class Edificio {
    String ubicacion;
    String nombre_E;
    String cantidad_departamentos;
    String cantidad_pisos;

    public Edificio(String ubicacion, String nombreE,String cantidadDep, String cantidadpisos) {
        this.ubicacion = ubicacion;
        this.nombre_E = nombreE;
          this.cantidad_departamentos = cantidadDep;
        this.cantidad_pisos = cantidadpisos;
    }

    Edificio() {
      
    }

    public String getUbicacion() {
        System.out.println("Km 64 1/2 , desvio Hacienda el Nilo sobre autopista a Zacatecoluca y Usulutan El Salvador ");        
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        
        this.ubicacion = ubicacion;
    }

    public String getNombreE(){ 
        System.out.println("ITCA FEPADE Edificio C");
        return nombre_E;
    }

    public void setNombreE(String nombreE) {
        this.nombre_E = nombreE;
    }

     
    public String getCantidadDep() {
        System.out.println("Cuatro departamentos ");
        return cantidad_departamentos;
    }

    public void setCantidadDep(String cantidadDep) {
        this.cantidad_departamentos = cantidadDep;
    }

    public String getCantidadpisos() {
        System.out.println("Tres pisos en el edificio C Y dos pisos en el edificio B");
        return cantidad_pisos;
    }

    public void setCantidadpisos(String cantidadpisos) {
        this.cantidad_pisos = cantidadpisos;
    }

}
