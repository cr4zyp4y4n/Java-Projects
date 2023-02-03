package ModularProgramming;
import java.util.Scanner;

public class CalcularIva {
    public static final String NEGRO = "\u001B[30m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String MORADO = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String BLANCO = "\u001B[37m";

    public static void main(String[] args) {
        precio();
    }

    public static float llegirFloat(String mensaje, float min, float max){
        Scanner llegir = new Scanner(System.in);
        float precio = 0;
        boolean valorCorrecte = false;
        do {
            System.out.println(mensaje);
            valorCorrecte = llegir.hasNextFloat();
            if (!valorCorrecte) {
                System.out.println(ROJO +"SERÁS MARICÓN, ESCRIBE UN NÚMERO PUTO SUBNORMAL"+ ROJO);
            } else {
                precio = llegir.nextFloat();

                if (precio < min || precio > max){
                    System.out.println(ROJO +"SERÁS MARICÓN, ESCRIBE UN NÚMERO PUTO SUBNORMAL"+ ROJO);
                    valorCorrecte = false;
                }
            }
            llegir.nextLine();
        }while (!valorCorrecte);

        return precio;
    }

    public static void precio(){
        Scanner llegir = new Scanner(System.in);
        float precioProducto = 0, pvp = 0;

        precioProducto = llegirFloat(AMARILLO +"ESCRIBE EL PRECIO DEL PRODUCTO ROBADO, PUTO GITANO", 1f,999999999f);
        System.out.println(VERDE +"El coste del producto sin IVA és: " + precioProducto + " €");
        pvp = iva(precioProducto);
        System.out.println(VERDE +"El coste del producto con el impuesto que se llevan los del PP és: " + pvp + " €");
    }
    
    private static float iva(float coste) {
        return coste * 1.21f;
    }
}