package portillo_edwin_lab1semana3;
import java.util.Scanner;
import java.util.Random;

public class palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        scanner.useDelimiter("\n");
        
        //Declarar variable de opción y de bucle for
        int opcion = 0, i, j;
        
        //Contador veces entradas
        int contadorOpcion1 = 0, contadorOpcion2 = 0, contadorOpcion3 = 0, contadorOpcion4 = 0;
        
        //Menú opciones
        while (opcion != 5) {
            System.out.println("Favor ingrese el número de la opción que desee elegir:");
            System.out.println("1. Palabra al revés");
            System.out.println("2. Número perfecto");
            System.out.println("3. Número primo");
            System.out.println("4. Votaciones");
            System.out.println("5. Salir del Sistema");
            
            opcion = scanner.nextInt();
            
            switch (opcion) {
                
                //Ejercicio palabra al revés
                case 1:
                   
                    //Declaración variables
                    int numeroPalabras, tamanioPalabra, mayorVeces = 0;
                    String palabraInvertida = "", palabraMayor = "", palabraIngresada, palabraPalindroma = "";
        
                    System.out.println("Bienvenido a la opción 1!");
                    System.out.println("Ingrese la cantidad de palabras a evaluar");
                    numeroPalabras = scanner.nextInt();
        
                    //Ciclo for para invertir la palbra
                    for (i = 1; i <= numeroPalabras; i++) {
                        System.out.println("Palabra #" + i + " :");
                        palabraIngresada = scanner.next();
                        tamanioPalabra = palabraIngresada.length();
                        for (j = 0; j < tamanioPalabra; j++) {
                            palabraInvertida += palabraIngresada.charAt(palabraIngresada.length()-1-j);
                        }
                    
                    System.out.println(palabraInvertida);
                    
                    //Verificar si la palabra ingresada es la palabra mayor o igual que la palabra mayor anterior
                    if (palabraIngresada.length() > mayorVeces) {
                        mayorVeces = palabraIngresada.length();
                        palabraMayor = palabraIngresada;
                    } else if (palabraIngresada.length() == mayorVeces) {
                        palabraMayor += ", " + palabraIngresada;
                    }           
                    
                    palabraInvertida = "";
                    
                    }
                    
                    System.out.println("La(s) palabra(s) más larga(s) ingresada(s) es/son: " + palabraMayor + " con " + mayorVeces + " letras.");
                    
                    //Verificar si las palabras ingresadas son palíndromas o no
                    for (i = 0; i < palabraMayor.length(); i++) {
                        
                        if (i == 0) {
                        palabraPalindroma = palabraMayor.substring(0, palabraMayor.indexOf(','));
                        } else {
                        palabraPalindroma = palabraMayor.substring(0+palabraPalindroma.length()-1*i, palabraMayor.indexOf(','));   
                        }
                        for (j = 0; j < mayorVeces; j++) {
                            palabraInvertida += palabraPalindroma.charAt(palabraPalindroma.length()-1-j);
                        }
                        
                        if (palabraInvertida.equalsIgnoreCase(palabraMayor)) {
                            System.out.println(palabraPalindroma + " es palíndroma.");
                        } else {
                            System.out.println(palabraPalindroma + " no es palíndroma");
                        }
                        
                    }
                contadorOpcion1 ++;    
                break;
                
                case 2:
                    //Declaración variables
                    int numero, sumaDivisores = 0;
                    
                    System.out.println("Bienvenido a la opción 2!");
                    System.out.println("Ingrese un número:");
                    numero = scanner.nextInt();
                    
                    //Verificar si es divisor del numero ingresado
                    for (i = 1; i < numero; i++) {
                        if (numero % i == 0) {
                            sumaDivisores += i;
                        }                   
                    } 
                    
                    //Verificar si el número es perfecto o no
                    if (sumaDivisores == numero) {
                        System.out.println("Es un número perfecto");
                    }
                    else {
                        System.out.println("no es un número perfecto");
                    } 
                contadorOpcion2 ++;
                break;
                
                case 3: 
                    //Declaración variables
                    int numeroEvaluar = random.nextInt(100), divisores = 0; 
                    String listadivisores = "";
                    
                    System.out.println("Bienvenido a la opción 3!");
                    
                    //bucle para verificar sus divisores y almacenar estos mismos
                    for(i = 1; i <= numeroEvaluar; i++) {
                        
                        //evaluar si el número i es divisor o no y almacenarlo
                        if (numeroEvaluar % i == 0) {
                            divisores ++; 
                            
                            //en caso que i sea disinto a número a evaluar se anexa con coma, de lo contrario se anexa sin nada
                            if (i != numeroEvaluar) {
                                listadivisores += String.valueOf(i) + ", ";
                            } else {
                                listadivisores += String.valueOf(i);
                            }
                        }
                    }
                    
                    //Se imprime si es o no es primo
                    if (divisores == 2) {
                        System.out.println(numeroEvaluar + " es primo.");
                    } else {
                        System.out.println(numeroEvaluar + " no es primo.");
                    }
                    
                    System.out.println("sus divisores son: " + listadivisores);
                
                contadorOpcion3 ++;
                break;
                
                case 4:
                    //Declaración variables
                    int cantidadVotantes, votantesAzul = 0, votantesRojo = 0, votantesNegro = 0, votantesAmarillo = 0, votoIngresado, votosValidos = 0;
                    double porcentajeValidos;
                    
                    System.out.println("Bienvenido a la opción 4!");
                     
                    System.out.println("Ingrese la cantidad de votantes en el país:");
                    cantidadVotantes = scanner.nextInt();
                    
                    //for para ingresar los votos de los votantes
                    for (i = 0; i < cantidadVotantes; i++) {
                        System.out.println("Favor ingrese el número de la planilla la cual desea votar:");
                        System.out.println("1. AZUL");
                        System.out.println("2. ROJO");
                        System.out.println("3. NEGRO");
                        System.out.println("4. AMARILLO");
                        votoIngresado = scanner.nextInt(); 
                        
                        //Evaluar a cual contador se ingresa el voto ingresado 
                        switch (votoIngresado) {
                            case 1:
                                votantesAzul++;
                                votosValidos ++;
                            break;
                            case 2:
                                votantesRojo++;
                                votosValidos ++;
                            break;
                            case 3:
                                votantesNegro++;
                                votosValidos ++;
                            break;
                            case 4:
                                votantesAmarillo++;
                                votosValidos ++;
                            break;
                            default :
                                System.out.println("VOTO NULO.");
                            break;
                        }
                    }
                    
                    //Fórmula para sacar el porcentaje de votos validos
                    porcentajeValidos = (votosValidos * 100.0) / cantidadVotantes;
                    
                    //Determinar quien es el ganador o si la votación fue fallida
                        if (porcentajeValidos < 60) {
                            System.out.println("Votos válidos menor al 60%, VOTACIÓN FALLIDA");
                        } else {
                            if (votantesAzul > votantesRojo && votantesAzul > votantesNegro && votantesAzul > votantesAmarillo) {
                                System.out.println("Ganador: planilla azul con " + votantesAzul + " votos.");   
                            } else if (votantesRojo > votantesAzul && votantesRojo > votantesNegro && votantesRojo > votantesAmarillo) {
                                System.out.println("Ganador: planilla rojo con " + votantesRojo + " votos.");
                            } else if (votantesNegro > votantesAzul && votantesNegro > votantesRojo && votantesNegro > votantesAmarillo) {
                                System.out.println("Ganador: planilla negro con " + votantesNegro + " votos.");
                            } else {
                                System.out.println("Ganador: planilla amarilla con " + votantesAmarillo + " votos.");
                            }  
                        }
                    
                    //Mostrar la cantidad de votos nulos y votos válidos
                    System.out.println("Cantidad votos validos: " + votosValidos);
                    System.out.println("Cantidad votos nulos: " + (cantidadVotantes - votosValidos));
                
                contadorOpcion4 ++;
                break;
                
                default:
                    System.out.println("Veces ingresadas en opción 1. Palabra al revés: " + contadorOpcion1);
                    System.out.println("Veces ingresadas en opción 2. Número perfecto: " + contadorOpcion2);
                    System.out.println("Veces ingresadas en opción 3. Número primo: " + contadorOpcion3);
                    System.out.println("Veces ingresadas en opción 4. Votaciones: " + contadorOpcion4);
                    System.out.println("Saliendo del sistema...");
            }
        }     
    }
}
