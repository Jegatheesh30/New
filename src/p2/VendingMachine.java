package p2;
import java.util.Scanner;

public class VendingMachine {	
	
	public static void main(String[] args) {
		System.out.println("Available Chips pockets");
		String a = "lays";
		double a1 = 10.00;
		System.out.println("1 "+a +"    : " +a1);
		String b = "kurkure";
		double b1 = 5.00;
		System.out.println("2 "+b+" : " +b1);
		String c = "cheetos";
		double c1 = 15.00;
		System.out.println("3 "+c+" : " +c1);
		String d = "Bingos";
		double d1 = 5.00;
		System.out.println("4 "+d+"  : " +d1);
		String e = "Joy";
		double e1 = 10.00; 
		System.out.println("5 "+e+"     : " +e1);
		Scanner input = new Scanner(System.in);
		System.out.println("enter the serial no for selection");
		char exp = input.next().charAt(0);
		switch(exp) {
		case '1': 
		{
			System.out.println(a +": enter the qty ");
			int qty = input.nextInt();
			double sum = qty*a1;
			System.out.println("total value of qty : "+ sum);
		}
		break;
		case '2': 
		{
			System.out.println(b +": enter the qty ");
			int qty = input.nextInt();
			double sum = qty*b1;
			System.out.println("total value of qty : "+ sum);
		}
		break;
		case '3': 
		{
			System.out.println(c +": enter the qty ");
			int qty = input.nextInt();
			double sum = qty*c1;
			System.out.println("total value of qty : "+ sum);
		}
		break;
		case '4': 
		{
			System.out.println(d +": enter the qty ");
			int qty = input.nextInt();
			double sum = qty*d1;
			System.out.println("total value of qty : "+ sum);
		}
		break;
		case '5': 
		{
			System.out.println(e +": enter the qty ");
			int qty = input.nextInt();
			double sum = qty*e1;
			System.out.println("total value of qty : "+ sum);
		}
		break;
		}
		
	}

}
