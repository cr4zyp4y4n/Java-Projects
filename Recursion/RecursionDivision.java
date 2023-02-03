import java.util.Scanner;

public class DivisionRecursiva {
    public static void main(String[] args) {
        System.out.println(divisionRecursiva(llegirInt("Escribe el dividendo: ",0,999),llegirInt("Escribe el divisor: ",0,999)));
    }

    public static int divisionRecursiva(int dividendo, int divisor){
        if(divisor>dividendo){
            return 0;
        } else {
            return 1 + divisionRecursiva(dividendo-divisor, divisor);
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
