package ejercicio2;

import java.util.Scanner;
public class Salario_Minimo {
    public static void main(String[] args) {
        double salario1 = 0.0;
        double salario2 = 0.0;
        double salario3 = 0.0;
        CalcularSalario salario = new CalcularSalario();
        
         
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite las horas trabajadas :");
        salario.sethoras_trabajadas(leer.nextDouble());
        System.out.println("Introdusca el pago por hora :");
        salario.setpago_por_hora(leer.nextDouble());
        System.out.println("------------------------------------");
        salario.calcularSalario();
        
        salario1 = salario.calcularSalario();
        salario2 = salario.renta(salario);
        salario3 = salario.salarioLiquido(salario);
        System.out.println("El salario bruto es : $"+salario1);
        System.out.println("El monto de la retencion aplicada es : $"+salario2);
        System.out.println("El salario liquido es : $"+salario3);
    }
}
