import java.util.Scanner;

public class SumarNumerosRecursiva {
    public static void main(String[] args) {
        System.out.println(sumaDigitos(llegirInt("Escribe el numero para sumar sus dígitos: ",0,9999999)));
    }

    private static int sumaDigitos(int num) {
        if (num == 0) {
            return 0;
        } else {
            return sumaDigitos(num / 10) + num % 10;
        }
    }

    public static int llegirInt(String missatge, int min, int max) {
        Scanner llegir = new Scanner(System.in);
        int x = 0;
        boolean valorCorrecte = false;
        do{
            System.out.println(missatge);
            valorCorrecte = llegir.hasNextInt();
            if (!valorCorrecte){
                System.out.println("ERROR: Valor no enter.");
                llegir.nextLine();
            }else{ // Tinc un enter
                x = llegir.nextInt();
                llegir.nextLine();
                if (x < min || x > max){
                    System.out.println("Opció no vàlida");
                    valorCorrecte = false;
                }
            }
        }while(!valorCorrecte);

        return x;
    }
}
