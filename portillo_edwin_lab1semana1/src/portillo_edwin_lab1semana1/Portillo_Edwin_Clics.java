package portillo_edwin_lab1semana1;
import java.util.Scanner;

public class Portillo_Edwin_Clics {
    public static void main (String[] args){
        int clicks1 = 60;
        int clicks2 = 100;
        int clicks3 = 20;
        double costoClicks1 = 60 * 0.30;
        double costoClicks2 = 100 * 0.25;
        double costoClicks3 = 20 * 0.80;
        double costoTotal = costoClicks1 + costoClicks2 + costoClicks3;
        double cpcPromedio = costoTotal/ (clicks1 + clicks2 + clicks3);
        double cpcPromedioISV = cpcPromedio + (cpcPromedio*0.16);
        
        
        System.out.println(String.format("El costo por clicks promedio total (incluyendo ISV) es de: %.2f", cpcPromedioISV));
        
        
    }
}
