package Numbers;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		int a=0, b=0, res=0;
		String sel= null;
		Scanner tec=new Scanner(System.in);
		System.out.println("Seleccione la opcion\n");
		System.out.println("+:Suma"
				+ "\n-: Resta"
				+ "\n*: Multiplicacion"
				+ "/: Division");
		sel=tec.next();
		switch(sel) {
		case "+":
			System.out.println("ha seleccionado suma/n");
			System.out.println("ingrese el primer numero");
			a=tec.nextInt();
			System.out.println("ingrese el segundo numero");
			b=tec.nextInt();
			res=a+b;
			System.out.println(a+"+"+b+"="+res);
			break;
		case "-":
			System.out.println("ha seleccionado resta/n");
			System.out.println("ingrese el primer numero");
			a=tec.nextInt();
			System.out.println("ingrese el segundo numero");
			b=tec.nextInt();
			res=a-b;
			System.out.println(a+"-"+b+"="+res);
			break;
		case "*":
			System.out.println("ha seleccionado multiplicacion/n");
			System.out.println("ingrese el primer numero");
			a=tec.nextInt();
			System.out.println("ingrese el segundo numero");
			b=tec.nextInt();
			res=a*b;
			System.out.println(a+"*"+b+"="+res);
			break;
		case "/":
			System.out.println("ha seleccionado division/n");
			System.out.println("ingrese el primer numero");
			a=tec.nextInt();
			System.out.println("ingrese el segundo numero");
			b=tec.nextInt();
			res=a/b;
			System.out.println(a+"/"+b+"="+res);
			break;


			
			
		}
	}

}
