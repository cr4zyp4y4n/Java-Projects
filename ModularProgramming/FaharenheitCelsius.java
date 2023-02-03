package ModularProgramming;
import java.util.Scanner;

public class FaharenheitCelsius {

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

        float resultat;
        final String MENU_PRINCIPAL = "SELECIONA LA CONVERSIÓN NECESARIA:\n\t1- Fahrenheit -> Celsius \n\t2- Celsius -> Fahrenheit \n\t3- Salir";
        int opcionMenu = 0;
        System.out.println(CYAN +"######################################################################"+ RESET);
        System.out.println(AMARILLO + "Hola! Bienvenido a la calculadora de Fahrenheit a Celsius y viceversa!"+ RESET);
        System.out.println(CYAN +"######################################################################"+ RESET);

        do {
            opcionMenu = llegirEnter(MENU_PRINCIPAL,1,3);
            System.out.println(CYAN +"######################################################################"+ RESET);
            switch (opcionMenu){
                case 1:
                    float fahrenheit = llegirFloat("Escribe la temperatura en Fahrenheit a convertir: ");
                    System.out.println(CYAN +"######################################################################"+ RESET);
                    resultat = fahrenheitCelsius(fahrenheit);
                    System.out.println("La conversion a celsius es de: " + AMARILLO + "[" + resultat + "]" + RESET);
                    System.out.println(CYAN +"######################################################################"+ RESET);
                    break;
                case 2:
                    float celsius = llegirFloat("Escribe la temperatura en Celsius a convertir: ");
                    System.out.println(CYAN +"######################################################################"+ RESET);
                    resultat = celsiusFahrenheit(celsius);
                    System.out.println("La conversion a fahrenheit es de: " + AMARILLO + "[" + resultat + "]" + RESET);
                    System.out.println(CYAN +"######################################################################"+ RESET);
                    break;
                case 3:
                    System.out.println("Saliendo de la máquina de conversión...");
                    System.out.println(CYAN +"######################################################################"+ RESET);
                    break;
            }


        }while(opcionMenu!=3);
    }

    /**
     * Metodo para convertir fahrenheit a celsius
     * @param numero Valor a convertir en el código
     * @return Devuelve el float numero convertido a celsius
     */
    public static float fahrenheitCelsius(float numero) {
        numero = (numero - 32) * 5 / 9;

        return numero;
    }

    /**
     * Metodo para convertir celsius a fahrenheit
     * @param numero Valor a convertir en el código
     * @return Devuelve el float numero convertido a fahrenheit
     */
    public static float celsiusFahrenheit(float numero){
        numero = numero * 9 / 5 + 32;

        return numero;
    }

    /**
     * Metodo para comprobar si un numero és entero
     * @param missatge Mensaje que nos saldrá, escrito por el usuario
     * @param min valor minimo
     * @param max valor máximo
     * @return Devuelve el int comprobado
     */
    public static int llegirEnter(String missatge, int min, int max) {
        final String RED = "\033[31m";
        final String RESET = "\u001B[0m";
        Scanner llegir = new Scanner(System.in);

        int x = 0;
        boolean valorCorrecte = false;

        do{
            System.out.println(missatge);
            valorCorrecte = llegir.hasNextInt();

            if (!valorCorrecte){
                System.out.println(RED + "ERROR! EL VALOR NO ES UN ENTERO"+ RESET);
                llegir.nextLine();
            }else{ // Tinc un enter
                x = llegir.nextInt();
                llegir.nextLine();
                if (x < min || x > max){
                    System.out.println(RED + "OPCIÓN NO VALIDA" + RESET);
                    valorCorrecte = false;
                }
            }
        }while(!valorCorrecte);

        return x;
    }

    /**
     * Metodo para comprobar si un numero és float
     * @param missatge Mensaje que nos soldrá por pantalla, escrito anteriormente.
     * @return Devuelve el float comprobado
     */
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
                System.out.println(RED + "ERROR: VALOR NO NUMÉRICO"+ RESET);
                llegir.nextLine();
            }else{
                x = llegir.nextFloat();
                llegir.nextLine();
            }

        }while(!valorCorrecte);

        return x;
    }

}