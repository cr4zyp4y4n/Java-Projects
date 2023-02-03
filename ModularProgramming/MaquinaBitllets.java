package ModularProgramming;
import java.util.Scanner;

public class MaquinaBitllets {

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

        final String MENU_PRINCIPAL = "SELECIONA EL BILLETE DESEADO:\n\t1- Bitllet Senzill [ 2,40€ ] \n\t2- TCasual [ 11,35€ ] \n\t3- TUsual [ 40,00€ ] \n\t4- TFamiliar [ 10,00€ ] \n\t5- TJove [ 80,00€ ]";
        final String MENU_ZONES = "SELECCIONA EL NUMERO DE ZONAS: \n\t1- Zona \n\t2- Zonas \n\t3- Zonas \n\t4- Atrás";
        int opcioMenu = 0;
        int opcioZonas = 0;
        float moneda = 0;
        float importe = 0;
        boolean monedaValida = false;

        System.out.println(CYAN + "#######################################################" + RESET);
        System.out.println(AMARILLO + "Hola! Bienvenido a la máquina de venta de billetes!" + RESET);
        System.out.println(CYAN + "#######################################################" + RESET);

        do {
            opcioMenu = llegirEnter(MENU_PRINCIPAL, 1, 5);
            opcioZonas = llegirEnter(MENU_ZONES, 1,4);
            System.out.println(CYAN + "#######################################################" + RESET);
            switch (opcioMenu) {
                case 1:
                    System.out.println("Has seleccionado Bitllet Senzill");
                    switch (opcioZonas){
                        case 1:
                            importe = 0;
                            System.out.println(CYAN + "#######################################################" + RESET);
                            System.out.println(AMARILLO + "Importe necesario: 2.40€" + RESET);
                            do {
                                do {
                                    System.out.println(CYAN + "#######################################################" + RESET);
                                    System.out.println(AMARILLO + "Llevas " + importe + "€" + RESET);
                                    System.out.println(CYAN + "#######################################################" + RESET);
                                    moneda = llegirFloat("Introduce el importe necesario:");
                                    monedaValida = comprovarMoneda(moneda);
                                    if (!monedaValida){
                                        System.out.println(CYAN + "#######################################################" + RESET);
                                        System.out.println("Moneda no válida, vuelve a introducir.");
                                    }
                                }while (!monedaValida);
                                importe += moneda;
                                } while (importe < 2.40);
                            System.out.println(CYAN + "#######################################################" + RESET);
                            System.out.println("Aquí tienes tu cambio: " + (importe - 2.40));
                            System.out.println("Muchas gracias!");
                            System.out.println(CYAN + "#######################################################" + RESET);
                            break;
                        case 2:
                            importe = 0;
                            System.out.println(CYAN + "#######################################################" + RESET);
                            System.out.println(AMARILLO + "Importe necesario: 3.15€" + RESET);
                            do {
                                do {
                                    System.out.println(CYAN + "#######################################################" + RESET);
                                    System.out.println(AMARILLO + "Llevas " + importe + "€" + RESET);
                                    System.out.println(CYAN + "#######################################################" + RESET);
                                    moneda = llegirFloat("Introduce el importe necesario:");
                                    monedaValida = comprovarMoneda(moneda);
                                    if (!monedaValida){
                                        System.out.println(CYAN + "#######################################################" + RESET);
                                        System.out.println("Moneda no válida, vuelve a introducir.");
                                    }
                                }while (!monedaValida);
                                importe += moneda;
                            } while (importe < 3.15);
                            System.out.println(CYAN + "#######################################################" + RESET);
                            System.out.println("Aquí tienes tu cambio: " + (importe - 3.15));
                            System.out.println("Muchas gracias!");
                            System.out.println(CYAN + "#######################################################" + RESET);
                            break;
                        case 3:
                            importe = 0;
                            System.out.println(CYAN + "#######################################################" + RESET);
                            System.out.println(AMARILLO + "Importe necesario: 4.40€" + RESET);
                            System.out.println(CYAN + "#######################################################" + RESET);
                            do {
                                do {
                                    System.out.println(CYAN + "#######################################################" + RESET);
                                    System.out.println(AMARILLO + "Llevas " + importe + "€" + RESET);
                                    System.out.println(CYAN + "#######################################################" + RESET);
                                    moneda = llegirFloat("Introduce el importe necesario:");
                                    monedaValida = comprovarMoneda(moneda);
                                    if (!monedaValida){
                                        System.out.println(CYAN + "#######################################################" + RESET);
                                        System.out.println("Moneda no válida, vuelve a introducir.");
                                    }
                                }while (!monedaValida);
                                importe += moneda;
                            } while (importe < 4.40);
                            System.out.println(CYAN + "#######################################################" + RESET);
                            System.out.println("Aquí tienes tu cambio: " + (importe - 4.40));
                            System.out.println("Muchas gracias!");
                            System.out.println(CYAN + "#######################################################" + RESET);
                            break;
                        case 4:
                            System.out.println("Volviendo atras...");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Has seleccionado TCasual");
                    switch (opcioZonas){
                        case 1:
                            importe = 0;
                            System.out.println(CYAN + "#######################################################" + RESET);
                            System.out.println(AMARILLO + "Importe necesario: 11.35€" + RESET);
                            System.out.println(CYAN + "#######################################################" + RESET);
                            do {
                                do {
                                    System.out.println(CYAN + "#######################################################" + RESET);
                                    System.out.println(AMARILLO + "Llevas " + importe + "€" + RESET);
                                    System.out.println(CYAN + "#######################################################" + RESET);
                                    moneda = llegirFloat("Introduce el importe necesario:");
                                    monedaValida = comprovarMoneda(moneda);
                                    if (!monedaValida){
                                        System.out.println(CYAN + "#######################################################" + RESET);
                                        System.out.println("Moneda no válida, vuelve a introducir.");
                                    }
                                }while (!monedaValida);
                                importe += moneda;
                            } while (importe < 11.53);
                            System.out.println(CYAN + "#######################################################" + RESET);
                            System.out.println("Aquí tienes tu cambio: " + (importe - 11.35));
                            System.out.println("Muchas gracias!");
                            System.out.println(CYAN + "#######################################################" + RESET);
                            break;
                        case 2:
                            importe = 0;
                            System.out.println(CYAN + "#######################################################" + RESET);
                            System.out.println(AMARILLO + "Importe necesario: 14.90€" + RESET);
                            System.out.println(CYAN + "#######################################################" + RESET);
                            do {
                                do {
                                    System.out.println(CYAN + "#######################################################" + RESET);
                                    System.out.println(AMARILLO + "Llevas " + importe + "€" + RESET);
                                    System.out.println(CYAN + "#######################################################" + RESET);
                                    moneda = llegirFloat("Introduce el importe necesario:");
                                    monedaValida = comprovarMoneda(moneda);
                                    if (!monedaValida){
                                        System.out.println(CYAN + "#######################################################" + RESET);
                                        System.out.println("Moneda no válida, vuelve a introducir.");
                                    }
                                }while (!monedaValida);
                                importe += moneda;
                            } while (importe < 14.90);
                            System.out.println(CYAN + "#######################################################" + RESET);
                            System.out.println("Aquí tienes tu cambio: " + (importe - 14.90));
                            System.out.println("Muchas gracias!");
                            System.out.println(CYAN + "#######################################################" + RESET);                            break;
                        case 3:
                            importe = 0;
                            System.out.println(CYAN + "#######################################################" + RESET);
                            System.out.println(AMARILLO + "Importe necesario: 20.95€" + RESET);
                            System.out.println(CYAN + "#######################################################" + RESET);
                            do {
                                do {
                                    System.out.println(CYAN + "#######################################################" + RESET);
                                    System.out.println(AMARILLO + "Llevas " + importe + "€" + RESET);
                                    System.out.println(CYAN + "#######################################################" + RESET);
                                    moneda = llegirFloat("Introduce el importe necesario:");
                                    monedaValida = comprovarMoneda(moneda);
                                    if (!monedaValida){
                                        System.out.println(CYAN + "#######################################################" + RESET);
                                        System.out.println("Moneda no válida, vuelve a introducir.");
                                    }
                                }while (!monedaValida);
                                importe += moneda;
                            } while (importe < 20.95);
                            System.out.println(CYAN + "#######################################################" + RESET);
                            System.out.println("Aquí tienes tu cambio: " + (importe - 20.95));
                            System.out.println("Muchas gracias!");
                            System.out.println(CYAN + "#######################################################" + RESET);
                            break;
                        case 4:
                            System.out.println("Volviendo atras...");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Has seleccionado TUsual");
                    switch (opcioZonas){
                        case 1:
                            importe = 0;
                            System.out.println(CYAN + "#######################################################" + RESET);
                            System.out.println(AMARILLO + "Importe necesario: 40.00€" + RESET);
                            System.out.println(CYAN + "#######################################################" + RESET);
                            do {
                                do {
                                    System.out.println(CYAN + "#######################################################" + RESET);
                                    System.out.println(AMARILLO + "Llevas " + importe + "€" + RESET);
                                    System.out.println(CYAN + "#######################################################" + RESET);
                                    moneda = llegirFloat("Introduce el importe necesario:");
                                    monedaValida = comprovarMoneda(moneda);
                                    if (!monedaValida){
                                        System.out.println(CYAN + "#######################################################" + RESET);
                                        System.out.println(ROJO +"Moneda no válida, vuelve a introducir." + RESET);
                                    }
                                }while (!monedaValida);
                                importe += moneda;
                            } while (importe < 40.00);
                            System.out.println(CYAN + "#######################################################" + RESET);
                            System.out.println("Aquí tienes tu cambio: " + (importe - 40.00));
                            System.out.println("Muchas gracias!");
                            System.out.println(CYAN + "#######################################################" + RESET);
                            break;
                        case 2:
                            importe = 0;
                            System.out.println(CYAN + "#######################################################" + RESET);
                            System.out.println(AMARILLO + "Importe necesario: 52.50€" + RESET);
                            System.out.println(CYAN + "#######################################################" + RESET);
                            do {
                                do {
                                    System.out.println(CYAN + "#######################################################" + RESET);
                                    System.out.println(AMARILLO + "Llevas " + importe + "€" + RESET);
                                    System.out.println(CYAN + "#######################################################" + RESET);
                                    moneda = llegirFloat("Introduce el importe necesario:");
                                    monedaValida = comprovarMoneda(moneda);
                                    if (!monedaValida){
                                        System.out.println(CYAN + "#######################################################" + RESET);
                                        System.out.println("Moneda no válida, vuelve a introducir.");
                                    }
                                }while (!monedaValida);
                                importe += moneda;
                            } while (importe < 52.50);
                            System.out.println(CYAN + "#######################################################" + RESET);
                            System.out.println("Aquí tienes tu cambio: " + (importe - 52.50));
                            System.out.println("Muchas gracias!");
                            System.out.println(CYAN + "#######################################################" + RESET);
                            break;
                        case 3:
                            importe = 0;
                            System.out.println(CYAN + "#######################################################" + RESET);
                            System.out.println(AMARILLO + "Importe necesario: 73.80€" + RESET);
                            System.out.println(CYAN + "#######################################################" + RESET);
                            do {
                                do {
                                    System.out.println(CYAN + "#######################################################" + RESET);
                                    System.out.println(AMARILLO + "Llevas " + importe + "€" + RESET);
                                    System.out.println(CYAN + "#######################################################" + RESET);
                                    moneda = llegirFloat("Introduce el importe necesario:");
                                    monedaValida = comprovarMoneda(moneda);
                                    if (!monedaValida){
                                        System.out.println(CYAN + "#######################################################" + RESET);
                                        System.out.println("Moneda no válida, vuelve a introducir.");
                                    }
                                }while (!monedaValida);
                                importe += moneda;
                            } while (importe < 73.80);
                            System.out.println(CYAN + "#######################################################" + RESET);
                            System.out.println("Aquí tienes tu cambio: " + (importe - 73.80));
                            System.out.println("Muchas gracias!");
                            System.out.println(CYAN + "#######################################################" + RESET);
                            break;
                        case 4:
                            System.out.println("Volviendo atras...");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Has seleccionado TFamiliar");
                    switch (opcioZonas){
                        case 1:
                            importe = 0;
                            System.out.println(CYAN + "#######################################################" + RESET);
                            System.out.println(AMARILLO + "Importe necesario: 10.00€" + RESET);
                            System.out.println(CYAN + "#######################################################" + RESET);
                            do {
                                do {
                                    System.out.println(CYAN + "#######################################################" + RESET);
                                    System.out.println(AMARILLO + "Llevas " + importe + "€" + RESET);
                                    System.out.println(CYAN + "#######################################################" + RESET);
                                    moneda = llegirFloat("Introduce el importe necesario:");
                                    monedaValida = comprovarMoneda(moneda);
                                    if (!monedaValida){
                                        System.out.println(CYAN + "#######################################################" + RESET);
                                        System.out.println("Moneda no válida, vuelve a introducir.");
                                    }
                                }while (!monedaValida);
                                importe += moneda;
                            } while (importe < 10.00);
                            System.out.println(CYAN + "#######################################################" + RESET);
                            System.out.println("Aquí tienes tu cambio: " + (importe - 10.00));
                            System.out.println("Muchas gracias!");
                            System.out.println(CYAN + "#######################################################" + RESET);
                            break;
                        case 2:
                            importe = 0;
                            System.out.println(CYAN + "#######################################################" + RESET);
                            System.out.println(AMARILLO + "Importe necesario: 13.10€" + RESET);
                            System.out.println(CYAN + "#######################################################" + RESET);
                            do {
                                do {
                                    System.out.println(CYAN + "#######################################################" + RESET);
                                    System.out.println(AMARILLO + "Llevas " + importe + "€" + RESET);
                                    System.out.println(CYAN + "#######################################################" + RESET);
                                    moneda = llegirFloat("Introduce el importe necesario:");
                                    monedaValida = comprovarMoneda(moneda);
                                    if (!monedaValida){
                                        System.out.println(CYAN + "#######################################################" + RESET);
                                        System.out.println("Moneda no válida, vuelve a introducir.");
                                    }
                                }while (!monedaValida);
                                importe += moneda;
                            } while (importe < 13.10);
                            System.out.println(CYAN + "#######################################################" + RESET);
                            System.out.println("Aquí tienes tu cambio: " + (importe - 13.10));
                            System.out.println("Muchas gracias!");
                            System.out.println(CYAN + "#######################################################" + RESET);
                            break;
                        case 3:
                            importe = 0;
                            System.out.println(CYAN + "#######################################################" + RESET);
                            System.out.println(AMARILLO + "Importe necesario: 18.45€" + RESET);
                            System.out.println(CYAN + "#######################################################" + RESET);
                            do {
                                do {
                                    System.out.println(CYAN + "#######################################################" + RESET);
                                    System.out.println(AMARILLO + "Llevas " + importe + "€" + RESET);
                                    System.out.println(CYAN + "#######################################################" + RESET);
                                    moneda = llegirFloat("Introduce el importe necesario:");
                                    monedaValida = comprovarMoneda(moneda);
                                    if (!monedaValida){
                                        System.out.println(CYAN + "#######################################################" + RESET);
                                        System.out.println("Moneda no válida, vuelve a introducir.");
                                    }
                                }while (!monedaValida);
                                importe += moneda;
                            } while (importe < 18.45);
                            System.out.println(CYAN + "#######################################################" + RESET);
                            System.out.println("Aquí tienes tu cambio: " + (importe - 18.45));
                            System.out.println("Muchas gracias!");
                            System.out.println(CYAN + "#######################################################" + RESET);
                            break;
                        case 4:
                            System.out.println("Volviendo atras...");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Has seleccionado TJove");
                    switch (opcioZonas){
                        case 1:
                            importe = 0;
                            System.out.println(CYAN + "#######################################################" + RESET);
                            System.out.println(AMARILLO + "Importe necesario: 80.00€" + RESET);
                            System.out.println(CYAN + "#######################################################" + RESET);
                            do {
                                do {
                                    System.out.println(CYAN + "#######################################################" + RESET);
                                    System.out.println(AMARILLO + "Llevas " + importe + "€" + RESET);
                                    System.out.println(CYAN + "#######################################################" + RESET);
                                    moneda = llegirFloat("Introduce el importe necesario:");
                                    monedaValida = comprovarMoneda(moneda);
                                    if (!monedaValida){
                                        System.out.println(CYAN + "#######################################################" + RESET);
                                        System.out.println("Moneda no válida, vuelve a introducir.");
                                    }
                                }while (!monedaValida);
                                importe += moneda;
                            } while (importe < 80.00);
                            System.out.println(CYAN + "#######################################################" + RESET);
                            System.out.println("Aquí tienes tu cambio: " + (importe - 80.00));
                            System.out.println("Muchas gracias!");
                            System.out.println(CYAN + "#######################################################" + RESET);
                            break;
                        case 2:
                            importe = 0;
                            System.out.println(CYAN + "#######################################################" + RESET);
                            System.out.println(AMARILLO + "Importe necesario: 105.00€" + RESET);
                            System.out.println(CYAN + "#######################################################" + RESET);
                            do {
                                do {
                                    System.out.println(CYAN + "#######################################################" + RESET);
                                    System.out.println(AMARILLO + "Llevas " + importe + "€" + RESET);
                                    System.out.println(CYAN + "#######################################################" + RESET);
                                    moneda = llegirFloat("Introduce el importe necesario:");
                                    monedaValida = comprovarMoneda(moneda);
                                    if (!monedaValida){
                                        System.out.println(CYAN + "#######################################################" + RESET);
                                        System.out.println("Moneda no válida, vuelve a introducir.");
                                    }
                                }while (!monedaValida);
                                importe += moneda;
                            } while (importe < 105.00);
                            System.out.println(CYAN + "#######################################################" + RESET);
                            System.out.println("Aquí tienes tu cambio: " + (importe - 105.00));
                            System.out.println("Muchas gracias!");
                            System.out.println(CYAN + "#######################################################" + RESET);
                            break;
                        case 3:
                            importe = 0;
                            System.out.println(CYAN + "#######################################################" + RESET);
                            System.out.println(AMARILLO + "Importe necesario: 147.55€" + RESET);
                            System.out.println(CYAN + "#######################################################" + RESET);
                            do {
                                do {
                                    System.out.println(CYAN + "#######################################################" + RESET);
                                    System.out.println(AMARILLO + "Llevas " + importe + "€" + RESET);
                                    System.out.println(CYAN + "#######################################################" + RESET);
                                    moneda = llegirFloat("Introduce el importe necesario:");
                                    monedaValida = comprovarMoneda(moneda);
                                    if (!monedaValida){
                                        System.out.println(CYAN + "#######################################################" + RESET);
                                        System.out.println("Moneda no válida, vuelve a introducir.");
                                    }
                                }while (!monedaValida);
                                importe += moneda;
                            } while (importe < 147.55);
                            System.out.println(CYAN + "#######################################################" + RESET);
                            System.out.println("Aquí tienes tu cambio: " + (importe - 147.55));
                            System.out.println("Muchas gracias!");
                            System.out.println(CYAN + "#######################################################" + RESET);
                            break;
                        case 4:
                            System.out.println("Volviendo atras...");
                            break;
                    }
                    break;
            }
        } while (true);
    }

    /**
     * Metodo para leer un valor float
     * @param missatge ;ensaje escrito anteriormente por el programador
     * @return Devuelve el valor float comprobado
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

    /**
     * Metodo para leer un valor int
     * @param missatge Mensaje escrito anteriormente por el programadar
     * @param min Valor minimo aceptado
     * @param max Valor máximo aceptado
     * @return Devuelve el valor int comprobado
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
     * Metodo para comprovar si una moneda es real o es una moneda falsa, dentro tiene un vector con las monedas o billetes aceptados
     * @param moneda Parametro con el cual comprovaremos si es una moneda real o falsa
     * @return Devuelve true o false, según si la moneda es real o no.
     */
    public static boolean comprovarMoneda(float moneda){
        final float[]mv={0.01f,0.02f,0.05f,0.10f,0.20f,0.50f,1.0f,2.0f,5.0f,10.0f,20.0f,50.0f,100.0f,200.0f};

        boolean mc = false;

        for (int i = 0; i < mv.length; i++) {
            if (moneda == mv[i]){
                mc=true;
                break;
            }

        }
        return mc;
    }
}