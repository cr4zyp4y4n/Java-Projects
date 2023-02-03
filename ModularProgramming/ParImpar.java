package ModularProgramming;
import java.util.Scanner;

public class ParImpar {
    public static final String NEGRO = "\u001B[30m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String MORADO = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String BLANCO = "\u001B[37m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
            final String MENU_PRINCIPAL = AMARILLO +"Escull una opció: " +"\n\t1. Comprovar parell" +"\n\t2. Sortir"+ RESET;
             int opcio = 0;
             do {
                 opcio = llegirEnter(MENU_PRINCIPAL,1,2);
                 switch (opcio){
                     case 1:
                         int numero = llegirEnter("Escribe un numero aleatorio",0,9999999);
                         if (esPar(numero)) {
                             System.out.println("Sí es par");
                         } else {
                             System.out.println("No es par");
                         }
                         break;
                     case 2:
                         System.out.println("Sortint...");
                 }
             }while(opcio!=2);

        }

    /**
     * Metodo para comprovar si un numero és entero
     * @param missatge mensaje que nos saldrá, escrito por el usuario
     * @param min valor minimo
     * @param max valor máximo
     * @return
     */
    private static int llegirEnter(String missatge, int min, int max) {
        final String RED = "\033[31m";
        final String RESET = "\u001B[0m";
        Scanner llegir = new Scanner(System.in);

        int x = 0;
        boolean valorCorrecte = false;

        do{
            System.out.println(missatge);
            valorCorrecte = llegir.hasNextInt();

            if (!valorCorrecte){
                System.out.println(RED + "ERROR!"+ RESET + " El valor no es un entero pa.");
                llegir.nextLine();
            }else{ // Tinc un enter
                x = llegir.nextInt();
                llegir.nextLine();
                if (x < min || x > max){
                    System.out.println(RED + "Opción no válida pa" + RESET);
                    valorCorrecte = false;
                }
            }
        }while(!valorCorrecte);

        return x;
    }

    /**
     * Método para comprovar si un un numero és par o impar
     * @param numero numero que le pasamos con llegirEnter
     * @return
     */
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

}

