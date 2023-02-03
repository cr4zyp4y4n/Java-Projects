import java.util.Scanner;

public class SumarVectorRecursiva {
    public static void main(String[] args) {

        int[] vector1 = introduirNumeros();

        for (int i = 0; i < vector1.length; i++) {
            System.out.print(vector1[i] + " ");
        }
        System.out.println("\n##########################################");
        System.out.println("La suma de los números del vector es: " + sumaVector(vector1,0));
        System.out.println("##########################################");
    }

    public static int sumaVector(int vector[], int i) {
        if (i == vector.length){
            return 0;
        }else{
            return vector[i] + sumaVector(vector, i + 1);
        }
    }

    private static int[] introduirNumeros() {
        int[] matrix = new int[5];
        for (int i = 0; i <  matrix.length; i++) {
            int aux = 0;
            boolean trobat = false;
            do {
                trobat = false;
                aux = llegirInt("Introdueix el seguent numero: ", 1, 99999);
                for (int j = 0; j < i; j++) {
                    if (matrix[j] == aux) {
                        trobat = true;
                        break;
                    }
                }
            } while (trobat);
            matrix[i] = aux;
        }
        return matrix;
    }

    private static int llegirInt(String missatge, int min, int max) {
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