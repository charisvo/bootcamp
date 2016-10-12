import java.util.Scanner;



public class Exercise2_2{
	public static void main(String args[]){
		System.out.println("Enter binary number: ");
		Scanner number = new Scanner (System.in);
		String x = number.nextLine();
		int [] array = new int[8];
		for ( int i=0;i<8;i++){
			array[i]= Integer.parseInt(x.substring(i,i+1));
		}
		int sum=0;
		for ( int i=0;i<8;i++){
			sum += array[i];
		}
		if (sum%2==0){
			System.out.println("Parity check OK.");
		}
		else{
			System.out.println("Parity check not OK.");
		}
	}
}