import java.util.Scanner;

public class Objexercise1{
	public static void main(String args[]){

		System.out.println("Enter number1: ");
		Scanner snumber1 = new Scanner (System.in);
		int number1 = snumber1.nextInt();

		System.out.println("Enter number2: ");
		Scanner snumber2 = new Scanner (System.in);
		int number2 = snumber2.nextInt();

		System.out.println(bootCamp( number1, number2));
	}
	public static int bootCamp(int number1,int number2){
		if (number1<number2){
			int res= (int)Math.sqrt(Math.abs(number1-number2));
			return	res;
		}
		else {
			return number1+number2;
		}
	}
}