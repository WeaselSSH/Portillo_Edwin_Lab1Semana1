package portillo_edwin_lab1semana2;
import java.util.Scanner;


public class Clases {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        
        System.out.println("----Bienvenido a la academia de inglés----");
        System.out.println("Favor ingrese la fecha actual en el formato 'dia, DD/MM' (ejemplo: lunes, 27/03)");
        String fechaActual = scanner.next().toLowerCase().trim();        
        
        String diaEscrito = fechaActual.substring(0, fechaActual.indexOf(","));
        String diaNumerico = fechaActual.substring(fechaActual.indexOf(" ")+1, fechaActual.indexOf("/"));
        String mesNumerico = fechaActual.substring(fechaActual.indexOf("/")+1);
        
        
        if(Integer.parseInt(diaNumerico) < 1 || Integer.parseInt(diaNumerico) > 31 || Integer.parseInt(mesNumerico) > 12 || Integer.parseInt(mesNumerico) < 1){
            System.out.println("Error: fecha no existente.");
            return;
        }
        
        if(!diaEscrito.equals("lunes") && !diaEscrito.equals("martes") && !diaEscrito.equals("miercoles") && !diaEscrito.equals("jueves") && !diaEscrito.equals("viernes")) {
            System.out.println("Error: día de la semana no existente.");
            return;
        }
       
        if(diaEscrito.equals("lunes") || diaEscrito.equals("martes") || diaEscrito.equals("miercoles")) {
            System.out.println("Se tomaron examenes? (S/N)");
            String respuesta = scanner.next().toLowerCase().trim();
                if(respuesta.equals("s")) {
                    System.out.println("Ingrese cuantos alumnos aprobaron:");
                    int alumnosAprobados = scanner.nextInt();
                    System.out.println("Ingrese cuantos alumnos reprobaron:");
                    int alumnosReprobados = scanner.nextInt();
                    int total = alumnosAprobados + alumnosReprobados;
                    double porcentajeAprobados = (alumnosAprobados * 100.0) / total;
                    System.out.println(String.format("El porcentaje de alumnos aprobados es de: %.2f%%", porcentajeAprobados));
                } else {
                    System.out.println("No se tomaron examenes.");
                }
        } 
        
        if(diaEscrito.equals("jueves")) {
            System.out.println("Ingrese el porcentaje de asistencias:");
            double porcentajeAsistencia = scanner.nextDouble();
            if (porcentajeAsistencia > 50) {
                System.out.println("Asistió la mayoría");
            } else {
                System.out.println("No asistió la mayoría");
            }
        }
        
        if (diaEscrito.equals("viernes")) {
            if (diaNumerico.equals("01") && mesNumerico.equals("01") || diaNumerico.equals("01") && mesNumerico.equals("07") ) {
                System.out.println("Comienzo nuevo de ciclo.");
                System.out.println("Ingrese la cantidad de alumnos del nuevo ciclo");
                int cantidadAlumnos = scanner.nextInt();
                System.out.println("Ingrese el precio en $ por cada alumno:");
                double precioAlumno = scanner.nextDouble();
                double ingresoTotal = cantidadAlumnos * precioAlumno;
                System.out.println(String.format("El ingreso total es de: $. %.2f", ingresoTotal));
            } else {
                System.out.println("Clase de inglés para viajeros.");
            }
        }
    }
}
