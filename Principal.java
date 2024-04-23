package exercicio;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        leitor.close();

        Invoice fatura = new Invoice(01, "Teclado", 4, 100.0);

        System.out.println(fatura.getInvoiceAmount());
        
    }
}
