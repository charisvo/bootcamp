import java.util.Scanner;
import java.lang.Math;


public class Exercise2_1{
	public static void main(String args[]){
		System.out.println("Enter Tax Identification Number: ");
		Scanner taxnumber = new Scanner (System.in);
		String x = taxnumber.nextLine();
		int [] array = new int[9];
		for ( int i=0;i<9;i++){
			array[i]= Integer.parseInt(x.substring(i,i+1));
		}
		int sum=0;
		for ( int i=0;i<8;i++){
			sum += (array[7-i])*Math.pow(2,(i+1));
		}


		if ((array[8])==((sum%11)%10)){
			System.out.println("Tax Identification Number valid.");
		}
		else{
			System.out.println("Tax Identification Number not valid.");
		}
	}
}