package ejercicio2;

public class codigoArea {
    String codigo_computos;
    String Biblioteca;
    String zona_verde;
    String laboratorio;
    String cancha;
public codigoArea(String codigo_computos, String Biblioteca, String zona_verde, String lab, String cancha) {
        this.codigo_computos = codigo_computos;
        this.Biblioteca = Biblioteca;
        this.zona_verde = zona_verde;
        this.laboratorio = lab;
        this.cancha = cancha;
    }

    public codigoArea() {
    }

    public String getcodigo_computos() {
        System.out.println("El codigo de los computos es us01");
        return codigo_computos;
    }

    public void setcodigo_computos(String Ccomputos) {
        this.codigo_computos = Ccomputos;
    }

    public String getBiblioteca() {
        System.out.println("El codigo de la biblioteca es 567");
        return Biblioteca;
    }

    public void setBiblioteca(String Biblioteca) {
        this.Biblioteca = Biblioteca;
    }

    public String getzona_verde() {
        System.out.println("El codigo de la zona verde es v345");
        return zona_verde;
    }

    public void setzona_verde(String zonaVerd) {
        this.zona_verde = zonaVerd;
    }

    public String getLab(){
        System.out.println("El codigo de laboratorio es L098");
        return laboratorio;
    }

    public void setLab(String lab) {
        this.laboratorio = lab;
    }

    public String getCancha() {
        System.out.println("El codigo de la cancha es C865");
        return cancha;
    }

    public void setCancha(String cancha) {
        this.cancha = cancha;
    }

}
