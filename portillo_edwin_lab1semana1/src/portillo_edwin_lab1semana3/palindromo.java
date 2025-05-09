package portillo_edwin_lab1semana3;
import java.util.Scanner;

public class palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        
        int numeroPalabras, tamanioPalabra, mayorVeces = 0;
        String palabraInvertida = "", palabraIngresada = "", palabraMayor = "";
        
        
        System.out.println("Ingrese la cantidad de palabras a evaluar");
        numeroPalabras = scanner.nextInt();
        
        for (int i = 1; i <= numeroPalabras; i++) {
            System.out.println("Palabra #" + i + " :");
            palabraIngresada = scanner.next();
            tamanioPalabra = palabraIngresada.length();
            for (int j = 0; j < tamanioPalabra; j++) {
                palabraInvertida += palabraIngresada.charAt(palabraIngresada.length()-1-j);
            }
            System.out.println(palabraInvertida);
            if (palabraIngresada.length() > mayorVeces) {
                mayorVeces = palabraIngresada.length();
                palabraMayor = palabraIngresada;
            } else if (palabraIngresada.length() == mayorVeces) {
                palabraMayor += " " + palabraIngresada;
            }
            
            if (palabraInvertida.equalsIgnoreCase(palabraIngresada)) {
                System.out.println("La palabra es palíndroma");
            } else {
                System.out.println("La palabra no es palíndroma");
            }
            
            palabraInvertida = "";
        }
        System.out.println("La(s) palabra(s) más larga ingresada es/son:" + palabraMayor);
    }
}
