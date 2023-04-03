import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Entradas: Um número
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        teclado.close();
        //Processamento: Não tem
        //Saída: O número informado foi [número]
        System.out.println("O número informado foi [" + numero + "]");
    }
}
