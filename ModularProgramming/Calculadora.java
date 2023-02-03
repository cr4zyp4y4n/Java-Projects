package ModularProgramming;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        final String NEGRO = "\033[30m";
        final String ROJO = "\033[31m";
        final String VERDE = "\033[32m";
        final String AMARILLO = "\033[33m";
        final String AZUL = "\033[34m";
        final String MORADO = "\033[35m";
        final String CYAN = "\033[36m";
        final String BLANCO = "\033[37m";
        final String RESET = "\u001B[0m";

        float valor1, valor2, resultat;
        final String MISSATGE_2 = "Escribe el segundo numero pa: ";
        final String MENU_PRINCIPAL = "OPCIONES DISPONIBLES:\n\t1- Suma\n\t2- Resta\n\t3- Multplicación\n\t4- División\n\t5- Exponencial\n\t6- Exit";
        int opcioMenu = 0;
        System.out.println(MORADO +"#######################################"+ RESET);
        System.out.println("BIENVENIDO A LA SEX DUNGEON DE LA CALCULADORA...");
        System.out.println(MORADO +"#######################################"+ RESET);

       do {
            valor1 = llegirFloat("Escribe el primer número pa: ");
            valor2 = llegirFloat(MISSATGE_2);
            opcioMenu = llegirEnter(MENU_PRINCIPAL, 1, 6);
            switch (opcioMenu) {
                case 1:
                    resultat = suma(valor1, valor2);
                    System.out.println("La suma de los valores és: " + AMARILLO + "[" + resultat + "]" + RESET);
                    break;
                case 2:
                    resultat = resta(valor1, valor2);
                    System.out.println("La resta de los valores és: " + AMARILLO + "[" + resultat + "]" + RESET);
                    break;
                case 3: // TODO: multiplicació
                    resultat = multiplicacion(valor1, valor2);
                    System.out.println("El resultado de la multiplicacón és: " + AMARILLO + "[" + resultat + "]" + RESET);
                    break;
                case 4: // TODO: divisió
                    resultat = division(valor1, valor2);
                    System.out.println("El resultado de la división és: " + AMARILLO + "[" + resultat + "]" + RESET);
                    break;
                case 5: // TODO: exponencial (opcional)
                    System.out.println("En construcció...");
                    break;
                case 6:
                    System.out.println("Sortint... ");
                    break;
                default: // TODO: Desenvolupar default
                    System.out.println("Opció no vàlida");
                    break;

            }
        }while(opcioMenu != 6);

    }

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

    public static float llegirFloat(String missatge){
        final String RED = "\033[31m";
        final String RESET = "\u001B[0m";
        Scanner llegir = new Scanner(System.in);

        float x = 0;
        boolean valorCorrecte = false;

        do{
            System.out.print(missatge);
            valorCorrecte = llegir.hasNextFloat();

            if (!valorCorrecte){
                System.out.println(RED + "ERROR:"+ RESET + "Valor no numérico.");
                llegir.nextLine();
            }else{
                x = llegir.nextFloat();
                llegir.nextLine();
            }

        }while(!valorCorrecte);

        return x;
    }

    public static float suma (float x, float y){
        float suma = x + y;
        return suma;
    }

    public static float resta (float x, float y){
        float resta = x - y;
        return resta;
    }

    public static float multiplicacion (float x, float y){
        float multipicacion = x * y;
        return multipicacion;
    }

    public static float division (float x, float y){
        float division = x / y;
        return division;
    }
}

