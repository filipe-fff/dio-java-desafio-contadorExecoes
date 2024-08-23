package contador;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("começo: ");
        int v1 = teclado.nextInt();
        System.out.print("fim: ");
        int v2 = teclado.nextInt();
        try {
            contar(v1, v2);
        } catch(ParametrosInvalidosException e) {
            e.printStackTrace();
        }
    }
    public static void contar(int v1, int v2) throws ParametrosInvalidosException {
        if(v1 > v2) {
            throw new ParametrosInvalidosException();
        }
        for(int n=v1; n <= v2; n++) {
            System.out.println(n);
        }
    }
}