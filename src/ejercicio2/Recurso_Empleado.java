package ejercicio2;

import java.util.Scanner;

public class Recurso_Empleado {
    private Scanner leer;
    private String nombre_empleado;
    private String direccion_empleado;
    private String numero_edificio;
    private int cargo;
    private int codigo;
    private int edad_empleado;
    private double salario_base;
    private double salario_final;
    private double renta;
    private double AFP;
    private double ISSS;
   public void inicializar() {
        leer=new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        nombre_empleado=leer.next();
        System.out.print("Ingrese su edad: ");
        edad_empleado=leer.nextInt();
        System.out.print("Ingrese su salario bruto: ");
        salario_base=leer.nextDouble();
        System.out.print("Ingrese 1 si su cargo es por servicio y 2 si es permanente:");
        cargo =leer.nextInt();
          System.out.print("Ingrese su direccion: ");
        direccion_empleado=leer.next();
          System.out.print("Ingrese Numero de edificio: ");
        numero_edificio=leer.next();
       System.out.println("");
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre_empleado + "\n");
        System.out.println("Edad: " + edad_empleado + "\n");
         System.out.println("Direccion: "+ direccion_empleado + "\n");
         System.out.println("Numero de edificio :" + numero_edificio );
         System.out.println("");
    }
    public void cargo() {
        if (cargo==1) {
            renta= (salario_base * 0.10);
             salario_final= (salario_base-renta);
             System.out.println("");
            System.out.print("Su cargo es por servicio y su salario final es :" + salario_final);
             System.out.println("");
            
        } else if(cargo==2){
             renta= (salario_base * 0.10);
             ISSS= (salario_base* 0.14);
             AFP= (salario_base * 0.10);
             salario_final= (salario_base-renta-ISSS-AFP);
             System.out.println("");
            System.out.print(" Su cargo es permanente y su salario final es :" + salario_final);
                    System.out.println("");
        }
        }
    public static void main(String[] args) {
        Edificio objeto= new Edificio();
        Recurso_Empleado Dpersona1;
        Dpersona1=new Recurso_Empleado();
        Dpersona1.inicializar();
        Dpersona1.imprimir();
        Dpersona1.cargo();
        
         System.out.println("");
         
        objeto.getUbicacion();
        objeto.getNombreE();
        objeto.getCantidadDep();
        objeto.getCantidadpisos();
        
        System.out.println("");
         
         codigoArea  codigo= new codigoArea();
         codigo.getcodigo_computos();
         codigo.getBiblioteca();
         codigo.getCancha();
         codigo.getLab();
         codigo.getzona_verde();
}
}
