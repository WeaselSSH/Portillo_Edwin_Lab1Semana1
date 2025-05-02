package portillo_edwin_lab1semana2;
import java.util.Scanner;

public class Tiempo {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un numero de segundos (entero):");
        int segundos = scanner.nextInt();
        
        
        int horas = segundos/3600;
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = segundos % 60;
        
        String resultado = (segundos > 0) ? String.format("El valor ingresado equivale a %d horas, %d minutos y %d segundos", horas, minutos, segundosRestantes) 
                                       : "Valor ingresado no válido";
        
        System.out.println(resultado);
    }
}
