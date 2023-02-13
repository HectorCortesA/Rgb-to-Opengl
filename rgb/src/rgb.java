import java.util.Scanner;
import java.math.*;
public class rgb {

    float a;
    float b;
    float d = 1f;
    float c;
    float e = 255f;
    float f, g, h;

    public void rgb() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("CONVERTIR COLORES RGB");
        System.out.println("\n");

        System.out.println("Ingresar COLORES RGB");
        System.out.println("Ingrese el valor de 1");
        a = entrada.nextFloat();

        System.out.println("Ingrese el valor de 2");
        b = entrada.nextFloat();
        
        System.out.println("Ingrese el valor de 3");
        c = entrada.nextFloat();
      
        System.out.println("\n");
    }

public void salida(){
    f =(a*d)/e;
    g =(b*d)/e;
    h =(c*d)/e;

    System.out.printf("El color es: %1.3f, %1.3f, %1.3f ",f,g,h);

}
}

