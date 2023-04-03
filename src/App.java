import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Entradas: Um número
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com um número: ");
        int numero = teclado.nextInt();
        teclado.close();
        //Processamento: Não tem
        //Saída: O número informado foi [número]
        System.out.printf("O número informado foi [%d]", numero);
    }
}
