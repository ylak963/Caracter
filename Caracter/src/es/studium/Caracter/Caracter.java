package es.studium.Caracter;

import java.util.Scanner;

public class Caracter {

	public static void main(String[] args) 
	{
		char caracter;
		int x;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Indique un carácter:");

		caracter=teclado.nextLine().charAt(0);
		x=(int)caracter;
		

		if(x<=65 && x>=90)
		{
			System.out.println("El caracter introducido es una letra mayúscula.");

		if(x<=97 && x>=122)
		{
			System.out.println("El caracter introducido es una letra minúscula.");
		}
		if(x<=48 && x>=57)
		{
			System.out.println("El caracter introducido es un dígito.");
		}
		if((x<=33 && x>=47)||(x<=58 && x>=96)||(x<=123 && x>= 126)|| (x<=155 && x>=159)|| (x<=166 && x>=180)||(x<=184 && x>=197)|| (x<=200 && x>=208)||(x<=217 && x>=223)||(x<=238 &&x>=254))
		{
			System.out.println("El caracter introducido es un símbolo.");
		}
		teclado.close();
	}
}
	
}

