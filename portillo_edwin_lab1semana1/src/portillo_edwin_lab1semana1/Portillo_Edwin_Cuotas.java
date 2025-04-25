package portillo_edwin_lab1semana1;
import java.util.Scanner;

public class Portillo_Edwin_Cuotas {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Favor ingrese el monto del prestamo: ");
        double montoPrestamo = scanner.nextDouble(); 
        System.out.print("Favor ingrese el plazo de pago (en meses): ");
        int plazoPago = scanner.nextInt(); 
        System.out.print("Favor ingrese el porcentaje de interes mensual aplicado al prestamo (sin poner el símbolo de %): ");
        double interesMensual = scanner.nextDouble() / 100;
        System.out.print("Favor ingrese la comisión por cuota: ");
        double comisionCuota = scanner.nextDouble();
        System.out.print("Favor ingrese el porcentaje de seguro mensual (sin poner el símbolo de ): ");
        double porcentajeSeguro = scanner.nextDouble() / 100;
        
        double interesTotal = montoPrestamo * interesMensual * plazoPago;
        double montoTotal = montoPrestamo + interesTotal;
        double comisionTotal = comisionCuota * plazoPago;
        double seguroTotal = montoTotal * porcentajeSeguro;
        double totalPagar = montoTotal + comisionTotal + seguroTotal;
        double cuotaMensual = totalPagar/plazoPago;
        
        System.out.println("**** CUOTAS MENSUALES *******");
        System.out.println("Cuota de Pago Mensual: HNL " + cuotaMensual);
        System.out.println("Total a Pagar: HNL " + totalPagar);
             
    }
    
}


