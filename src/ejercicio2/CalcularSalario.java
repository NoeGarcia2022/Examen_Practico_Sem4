
package ejercicio2;

public class CalcularSalario {
    private double horas_trabajadas;
    private double pago_por_hora;

    public CalcularSalario() {
    }

    public CalcularSalario(double horas_trabajadas, double pago_por_hora) {
        this.horas_trabajadas = horas_trabajadas;
        this.pago_por_hora = pago_por_hora;
    }

    public double gethoras_trabajadas() {
        return horas_trabajadas;
    }

    public void sethoras_trabajadas(double horTravajadas) {
        this.horas_trabajadas = horTravajadas;
    }

    public double getpago_por_hora() {
        return pago_por_hora;
    }

    public void setpago_por_hora(double pagPorhora) {
        this.pago_por_hora = pagPorhora;
    }

    double calcularSalario() {
        double salario = 0;
        double horasPordos;
        double horasPortres;
        
        if (this.horas_trabajadas <= 40) {
            salario = this.horas_trabajadas * this.pago_por_hora;
            return salario;
        } else if (this.horas_trabajadas > 40 && this.horas_trabajadas < 48) {
            horasPordos = this.horas_trabajadas - 40;
            salario = (40 * this.pago_por_hora) + (horasPordos * this.pago_por_hora * 2);
            return salario; 
        } else if (this.horas_trabajadas > 48) {
            horasPortres = this.horas_trabajadas - 48;
            salario = (40 * this.pago_por_hora) + (8 * this.pago_por_hora * 2)+(horasPortres * this.pago_por_hora * 3);
            return salario;
        }
        return salario;
    }
    
    double renta(CalcularSalario salario){
    double rent;
    salario.calcularSalario();
    rent = salario.calcularSalario() * 0.10  ;
    return rent;
    }
    
    double salarioLiquido(CalcularSalario salaLiqui){
        double salarioLiqui;
        
        salarioLiqui = salaLiqui.calcularSalario() - salaLiqui.renta(salaLiqui);
        return salarioLiqui;
    }
}

