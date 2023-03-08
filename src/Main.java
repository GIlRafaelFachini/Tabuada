import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int contador = 1;
        int result = 0;

        System.out.println("Entre com a família da tabuada: ");
        int nt = scanner.nextInt();
        while (nt<0){
            System.out.println("Entre com a família da tabuada: ");
            nt = scanner.nextInt();
        }

        while (contador<11){
            result = nt * contador;
            System.out.println(nt + " X " + contador + " = " + result);
            contador++;
        }
    }
}
