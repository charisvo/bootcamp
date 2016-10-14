import java.util.Scanner;

public class Arrays{
	public static void main(String args[]){
		System.out.println("Enter number of shifts: ");
		Scanner snumber = new Scanner (System.in);
		int k = snumber.nextInt();
		Arrays.shift(k);
	}
	public static void shift( int k){
		int[] array = new int[] {1,2,3,4,5,6,7,8,9,10};
		int i=0,x,y,b;
		do{
			System.out.print("[");
			b=array[9];
			for(y=9;y>0;y--){
				array[y]=array[y-1];
			}
			array[0]=b;
			for(x=0;x<9;x++){
				System.out.print(array[x]+",");
			}
			System.out.print(array[9]+"]");
			System.out.println();
			i++;
			b=0;
		}while(i<k);
	}
}