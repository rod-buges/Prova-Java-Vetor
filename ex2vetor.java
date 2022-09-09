package newpackage;

import java.text.DecimalFormat;
import java.util.Scanner;

public class provaex2  {
	 public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);
	        DecimalFormat df = new DecimalFormat("0.00");
	        double salario[] = new double[2];
	        salario[0] = 1000;
	        salario[1] = salario[0] + (0.015*salario[0]);
	        int ano = 1997;
	        double taxa=0.015;
	        do{
	            taxa = taxa*2;
	            salario[1] = salario[1] + (taxa*salario[1]);
	            ano = ano+1;
	        } while(ano != 2023);
	  System.out.println("O salario dele em "+(ano-1)+" foi de R$"+df.format(salario[1]));
	  ler.close();
	    }
	}