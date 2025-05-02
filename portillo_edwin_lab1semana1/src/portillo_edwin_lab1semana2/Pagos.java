package portillo_edwin_lab1semana2;
import java.util.Scanner;

public class Pagos {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        
        System.out.println("Ingrese el código del empleado:");
        int codigoEmpleado = scanner.nextInt();
        System.out.println("Ingrese el nombre del empleado:");
        String nombreEmpleado = scanner.next();
        System.out.println("Ingrese el apellido del empleado:");
        String apellidoEmpleado = scanner.next();
        System.out.println("Ingrese la cantidad de horas trabajadas:");
        int horasTrabajadas = scanner.nextInt();
        
        System.out.println("Ingrese el número de la categoría del empleado:");
        System.out.println("Categoría 1: $40 por hora extra");
        System.out.println("Categoría 2: $50 por hora extra");
        System.out.println("Categoría 3: $85 por hora extra");
        System.out.println("Categoría 4: $0 por hora extra");
        int categoriaEmpleado = scanner.nextInt();
        
        double pagoNormal = 35.99;
        int horasNormales, horasExtras;
        
        if (horasTrabajadas <= 40) {
            horasNormales = horasTrabajadas;
            horasExtras = 0;
        } else {
            horasNormales = 40;
            horasExtras = horasTrabajadas - 40;
            if (horasExtras > 15) {
                horasExtras = 15;
            }
        }
        
        double pagoExtra = 0;
        
        switch (categoriaEmpleado) {
            case 1:
                pagoExtra = horasExtras * 40;
                break;
            case 2:
                pagoExtra = horasExtras * 50;
                break;
            case 3:
                pagoExtra = horasExtras * 85;
                break;
            case 4:
                pagoExtra = 0;
                break;
        }
        
        double pagoTotal = (horasNormales * pagoNormal) + pagoExtra;
        
        System.out.println("----Información del Empleado----");
        System.out.println(String.format("Código del empleado: %d",codigoEmpleado));
        System.out.println(String.format("Nombre del empleado: %s",nombreEmpleado));
        System.out.println(String.format("Apellido del empleado: %s", apellidoEmpleado));
        System.out.println(String.format("Categoría del empleado: %d", categoriaEmpleado));
        System.out.println(String.format("Horas normales trabajadas: %d",horasNormales));
        System.out.println("Pago horas normales: $35.99");
        System.out.println(String.format("Horas extra trabajadas: %d",horasExtras));
        System.out.println(String.format("Pago horas extra trabajadas: %.2f", pagoExtra));
        System.out.println(String.format("Pago total del empleado: %.2f",pagoTotal));
    }
}
