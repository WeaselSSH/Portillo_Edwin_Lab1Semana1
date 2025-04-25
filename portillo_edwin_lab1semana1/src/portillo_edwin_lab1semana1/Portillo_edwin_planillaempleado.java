package portillo_edwin_lab1semana1;
import java.util.Scanner;

public class Portillo_edwin_planillaempleado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.println("Favor ingrese las horas laboradas en el mes de parte del empleado:");
        double horasMensual = Double.valueOf(scanner.next());
        System.out.println("Favor ingrese la tarifa por hora de trabajo:");
        double tarifaHora = Double.valueOf(scanner.next());
        System.out.println("Favor ingrese el nombre del empleado:");
        String nombre = scanner.next();
        double salarioSemanal = ((horasMensual*tarifaHora)*12)/52;
        System.out.println("----- Boleta del Empleado -------");
        System.out.println("Nombre del Empleado: " + nombre);
        System.out.println("Hora de Trabajo Mensual: "+ horasMensual);
        System.out.println("Tarifa por Hora: Lps." + tarifaHora);
        System.out.println("Salario del Empleado Semanal: Lps. " + salarioSemanal);
    }
    
}
