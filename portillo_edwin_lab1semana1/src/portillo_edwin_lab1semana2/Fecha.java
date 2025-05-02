package portillo_edwin_lab1semana2;
import java.util.Scanner;

public class Fecha {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la primera fecha en el formato: DD/MM/YYYY. Ejemplo: 01/04/2006");
        String primeraFecha = scanner.next();
        System.out.println("Ingrese la segunda fecha en el formato: DD/MM/YYYY. Ejemplo: 01/04/2006");
        String segundaFecha = scanner.next();
        
        String diaEscrito1 = primeraFecha.substring(0,2);
        int diaNumerico1 = Integer.parseInt(diaEscrito1);
        String mesEscrito1 = primeraFecha.substring(3,5);
        int mesNumerico1 = Integer.parseInt(mesEscrito1);
        String anioEscrito1 = primeraFecha.substring(6);
        int anioNumerico1 = Integer.parseInt(anioEscrito1);
        
        String diaEscrito2 = segundaFecha.substring(0,2);
        int diaNumerico2 = Integer.parseInt(diaEscrito2);
        String mesEscrito2 = segundaFecha.substring(3,5);
        int mesNumerico2 = Integer.parseInt(mesEscrito2);
        String anioEscrito2 = segundaFecha.substring(6);
        int anioNumerico2 = Integer.parseInt(anioEscrito2);
        
        int diasTotal1 = diaNumerico1 + (mesNumerico1 * 30) + (anioNumerico1 * 360);
        int diasTotal2 = diaNumerico2 + (mesNumerico2 * 30) + (anioNumerico2 * 360);
        int diferenciaDias;
        
        if (diasTotal1 > diasTotal2) {
            diferenciaDias = diasTotal1 - diasTotal2;
            System.out.println("La diferencia de días entre la primera fecha y la segunda es de: " + diferenciaDias);
        } else{
            diferenciaDias = diasTotal2 - diasTotal1;
            System.out.println("La diferencia de días entre la primera fecha y la segunda es de: " + diferenciaDias);
        }
        
    }
}
