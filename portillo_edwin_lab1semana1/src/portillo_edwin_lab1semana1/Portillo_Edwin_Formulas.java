package portillo_edwin_lab1semana1;
import java.util.Scanner;

public class Portillo_Edwin_Formulas {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        double a,b,c,d,e,f,g,h,j,k,l,m,n,p,q,r,s,x,y;
        double resultado;
        
        System.out.println("#####Ejercicio A#####");
        System.out.println("Numerador 1:");
        a = scanner.nextDouble();
        System.out.println("Denominador 1:");
        b = scanner.nextDouble();
        System.out.println("Numerador 2:");
        c = scanner.nextDouble();
        System.out.println("Denominador 2:");
        d = scanner.nextDouble();
        resultado = a/b + c/d;
        System.out.println("El resultado es: " + resultado);
        
        System.out.println("#####Ejercicio B#####");
        System.out.println("Variable a:");
        a = scanner.nextDouble();
        System.out.println("Variable b:");
        b = scanner.nextDouble();
        System.out.println("Variable c:");
        c = scanner.nextDouble();
        System.out.println("Variable d:");
        d = scanner.nextDouble();
        System.out.println("Variable x:");
        x = scanner.nextDouble();
        System.out.println("Variable y:");
        y = scanner.nextDouble();
        resultado = (a/(x-b))-((c*x*y)/d);
        System.out.println("El resultado es: " + resultado);
        
        System.out.println("#####Ejercicio C#####");
        System.out.println("Variable a:");
        a = scanner.nextDouble();
        System.out.println("Variable b:");
        b = scanner.nextDouble();
        System.out.println("Variable c:");
        c = scanner.nextDouble();
        resultado = (a/b)+c;
        System.out.println("El resultado es: " + resultado);
        
        System.out.println("#####Ejercicio D#####");
        System.out.println("Variable a:");
        a = scanner.nextDouble();
        System.out.println("Variable b:");
        b = scanner.nextDouble();
        System.out.println("Variable c:");
        c = scanner.nextDouble();
        resultado = a+(b/c);
        System.out.println("El resultado es: " + resultado);
        
        System.out.println("#####Ejercicio E#####");
        System.out.println("Variable a:");
        a = scanner.nextDouble();
        System.out.println("Variable b:");
        b = scanner.nextDouble();
        System.out.println("Variable c:");
        c = scanner.nextDouble();
        System.out.println("Variable d:");
        d = scanner.nextDouble();
        System.out.println("Variable e:");
        e = scanner.nextDouble();
        System.out.println("Variable f:");
        f = scanner.nextDouble();
        System.out.println("Variable g:");
        g = scanner.nextDouble();
        System.out.println("Variable h:");
        h = scanner.nextDouble();
        System.out.println("Variable j:");
        j = scanner.nextDouble();
        resultado = ((a * a)/b-c) + ((d-e)/f-((g*h)/j));
        System.out.println("El resultado es: " + resultado);
        
        System.out.println("#####Ejercicio F#####");
        System.out.println("Variable m:");
        m = scanner.nextDouble();
        System.out.println("Variable n:");
        n = scanner.nextDouble();
        System.out.println("Variable p:");
        p = scanner.nextDouble();
        resultado = (m/n)+p;
        System.out.println("El resultado es: " + resultado);
        
        System.out.println("#####Ejercicio G#####");
        System.out.println("Variable m:");
        m = scanner.nextDouble();
        System.out.println("Variable n:");
        n = scanner.nextDouble();
        System.out.println("Variable p:");
        p = scanner.nextDouble();
        System.out.println("Variable q:");
        q = scanner.nextDouble();
        resultado = m + (n/(p-q));
        System.out.println("El resultado es: " + resultado);
             
        
        System.out.println("#####Ejercicio H#####");
        System.out.println("Variable a:");
        a = scanner.nextDouble();
        System.out.println("Variable b:");
        b = scanner.nextDouble();
        System.out.println("Variable c:");
        c = scanner.nextDouble();
        System.out.println("Variable d:");
        d = scanner.nextDouble();
        resultado = ((a*a)/(b*b))+((c*c)/(d*d));
        System.out.println("El resultado es: " + resultado);
        
        System.out.println("#####Ejercicio I#####");
        System.out.println("Variable m:");
        m = scanner.nextDouble();
        System.out.println("Variable n:");
        n = scanner.nextDouble();
        System.out.println("Variable p:");
        p = scanner.nextDouble();
        System.out.println("Variable q:");
        q = scanner.nextDouble();
        System.out.println("Variable r:");
        r = scanner.nextDouble();
        System.out.println("Variable s:");
        s = scanner.nextDouble();
        resultado = (m + (n/p))/(q-(r-s));
        System.out.println("El resultado es: " + resultado);
        
        System.out.println("#####Ejercicio J#####");
        System.out.println("Variable a:");
        a = scanner.nextDouble();
        System.out.println("Variable b:");
        b = scanner.nextDouble();
        System.out.println("Variable c:");
        c = scanner.nextDouble();
        System.out.println("Variable d:");
        d = scanner.nextDouble();
        System.out.println("Variable e:");
        e = scanner.nextDouble();
        System.out.println("Variable f:");
        f = scanner.nextDouble();
        System.out.println("Variable g:");
        g = scanner.nextDouble();
        System.out.println("Variable h:");
        h = scanner.nextDouble();
        System.out.println("Variable j:");
        j = scanner.nextDouble();
        System.out.println("Variable k:");
        k = scanner.nextDouble();
        System.out.println("Variable l:");
        l = scanner.nextDouble();
        resultado = ((a*b)+c)/(d-((e+(f*g)/(h+(j/(k*l))))));
        System.out.println("El resultado es: " + resultado);
        
        System.out.println("#####Ejercicio K#####");
        System.out.println("Variable a:");
        a = scanner.nextDouble();
        System.out.println("Variable b:");
        b = scanner.nextDouble();
        System.out.println("Variable c:");
        c = scanner.nextDouble();
        System.out.println("Variable d:");
        d = scanner.nextDouble();
        System.out.println("Variable x:");
        x = scanner.nextDouble();
        resultado = ((a*a)+(2*a*b)+(b*b))/(c/(x*x)+d);
        System.out.println("El resultado es: " + resultado);
    }
}
