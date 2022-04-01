/*En la escuela especializada en ingeniería ITCA-FEPADE se manejan un número grande de
empleados, recursos humanos proporciono la siguiente información.
Todo empleado tiene nombre, código de empleado, edad, dirección, área a la que pertenece,
cargo que desempeña en el área, sueldo base, fecha de ingreso. Los empleados pueden ser
docentes o administrativos. El docente puede ser permanente o por servicio. El área cuenta
con código de área, nombre, cantidad de empleados, numero de edificio.
Al final se desea capturar la información del empleado, imprimir los datos personales y el área
a la que pertenece. Del edificio se conoce la ubicación, el nombre, cantidad de departamentos
que alberga, cantidad de pisos.
Al final se desea saber también el salario final del empleado tomando en cuenta todos los
descuentos de ley (ISSS, AFP, ISR), recordar que si es empleado por servicio solo se le debe
descontar renta.*/
package ejercicio2;

import java.util.Scanner;

public class Empleado {
    private String nombre;
    private int codigo_empleado;
    private int edad;
    private String direccion;
    private String areaDeTrabajo ;
    private String cargoDeArea ;
    private double sueldo;
    private String fecha;
    
    Empleado() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo_empleado() {
        return codigo_empleado;
    }

    public void setCodigo_empleado(int codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getAreaDeTrabajo() {
        return areaDeTrabajo;
    }

    public void setAreaDeTrabajo(String areaDeTrabajo) {
        this.areaDeTrabajo = areaDeTrabajo;
    }

    public String getCargoDeArea() {
        return cargoDeArea;
    }

    public void setCargoDeArea(String cargoDeArea) {
        this.cargoDeArea = cargoDeArea;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public String datosPersonales(){
        String info = "\n";
        info+="El nombre es:"+nombre+"\n";
        info+="El codigo del empeado es:"+codigo_empleado+"\n";
        info+="La edad del trabajador es:"+edad+"\n";
        info+="La direccion del trabajador es:"+direccion+"\n";
        info+="El area de trabajo es:"+areaDeTrabajo+"\n";
        info+="El cargo del trabajador es:"+cargoDeArea+"\n";
        info+="El sueldo base del trabajador es:"+sueldo+"\n";
        
        return info;
    }

    public Empleado(String areaDeTrabajo) {
        this.areaDeTrabajo = areaDeTrabajo;
    }
    
    public static void main(String[] args) {
        Empleado emp = new Empleado();
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("DATOS DEL EMPLEADO");
        System.out.println("");
        
        System.out.print("Nombre: ");
        emp.setNombre(leer.next()); 
        
        System.out.print("Codigo: ");
        emp.setCodigo_empleado(leer.nextInt());
        
        System.out.print("Edad: ");
        emp.setEdad(leer.nextInt());
        
        System.out.print("Direccion: ");
        emp.setDireccion(leer.next());
        
        System.out.print("Area: ");
        emp.setAreaDeTrabajo(leer.next());
        
        System.out.print("Cargo: ");
        emp.setCargoDeArea(leer.next());
        
        System.out.print("Sueldo: ");
        emp.setSueldo(leer.nextDouble());
        
        System.out.print("Fecha: ");
        emp.setFecha(leer.next());
        
        
        System.out.println("Datos personales: " + emp.datosPersonales());
    }
}


