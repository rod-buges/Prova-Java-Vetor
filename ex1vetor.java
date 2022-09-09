package newpackage;

import java.util.Arrays;
import java.util.Scanner;

public class prova22  {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        int numeros[] = new int[5];
        for (int i =0; i< numeros.length; i++) {
        	System.out.println("Escreva o "+(i+1)+"º número: ");
        	numeros[i] = ler.nextInt();
        }
        Arrays.sort(numeros);
        for (int i=0; i < numeros.length; i++) {
        	System.out.println("Numeros["+i+"] = "+numeros[i]);
        }
        ler.close();
	}
}