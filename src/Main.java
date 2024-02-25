import java.util.Locale;
import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
		 
		 Locale.setDefault(Locale.US); 
		 Scanner sc = new Scanner(System.in);
		 
		 //Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.Fórmula da área: area = π . raio2Considere o valor de π = 3.14159//
	
		 /* double R, A, pi = 3.14159;
		 R = sc.nextDouble();
		 A = pi * R * R;
		 System.out.printf("A=%.4f%n", A);*/
		 
		 
//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produtode A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		
		/* int A, B, C, D, dif;
		 
		 A = sc.nextInt();
		 B = sc.nextInt();
		 C = sc.nextInt();
		 D = sc.nextInt();
		 
		 dif = A * B - C * D;
		 
		 System.out.println("diferenca =" + dif);*/
		 
		 /*int n, h;
		 double valorHora , salario;
		 n = sc.nextInt();
		 h = sc.nextInt();
		 valorHora = sc.nextDouble();
		  salario = valorHora * h;

		    System.out.println("NUMBER = " + n);
		    System.out.printf("SALARY = U$ %.2f%n", salario);
			*/
		 
		   /* int rows = 5, k = 0;
		    
		    for (int i = 1; i <= rows; ++i, k =0) {
		    	for (int space = 1; space < rows - i; ++space) {
		    		System.out.println("");
		    	}
		    	while (k != 2 * i - 1) {
		    		System.out.println("* ");
		    	}
		    	System.out.println();
		    }*/
		 
		   /*System.out.println("Enter the Scanner:");
		   int r = sc.nextInt();
		   System.out.println();
		   
		   for (int i = 1; i <= r; i++) {
			    for (int j = 1; j <= i; j++) {
			    	System.out.println("* ");
			    }
		   }*/
		    /*int N = sc.nextInt();
		   
		    if ( N < 0) {
		    	 System.out.println("Negativo");
		    }
		    else {
		    	System.out.println("positivo");
		    }*/
		 
		    /*int x = 10;
		    x = sc.nextInt();
		    if (x % 2 == 10) {
		    	System.out.println("numero impar");
		    }
		    else {
		    System.out.println("par");
		    }*/
		 
		 /* int a, b;  // Exercicios numeros multiplos
		  a = sc.nextInt();
		  b = sc.nextInt();
		  if (a % b == 0 || b % a == 0  ) {  // se a multiplica b ou se b multiplica a//
			  System.out.println("sao multiplos");
		  }
		  else {
			  System.out.println("nao sao multiplos");
		  }*/
		 // Criar um programa que leia um  codigo de um intem e a quantidade do item//
		 
		    /*int codigo = sc.nextInt();
			int quantidade = sc.nextInt();
			
			double total;
			if (codigo == 1) {
				total = quantidade * 4.0;
			}
			else if (codigo == 2) {
				total = quantidade * 4.5;
			}
			else if (codigo == 3) {
				total = quantidade * 5.0;
			}
			else if (codigo == 4) {
				total = quantidade * 2.0;
			}
			else {
				total = quantidade * 1.5;
			}

			System.out.printf("Total: R$ %.2f%n", total);*/
		 
		   int row, i, j, space = 1;
		   System.out.println("Enter the number of rows:");
		   row = sc.nextInt();
		   space = row - 1;
		   for (j = 1; j <= row; j++) {
			   for (i = 1; i <= space; i++) {
				   System.out.print("*");
			   }
			   space--;
			   for (i = 1; i <= 2 * j - 1; i++) {
				   System.out.print("");
			   }
			   System.out.println(" ");
		   }
		 
		   space = 1;
		   for (j = 1; j <= row; j++) {
			   for (i = 1; i <= space; i++) {
				   System.out.print("*");
			   }
			   space--;
			   for (i = 1; i <= 2 * j - 1; i++) {
				   System.out.print("");
			   }
			   System.out.println(" ");
		   }
		 
			  
		   
			sc.close();
		 
		 
		 
	   }

}
