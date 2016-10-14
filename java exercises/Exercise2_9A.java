import java.util.Scanner;

public class Exercise2_9A{
	public static void main(String args[]){
		System.out.println("Enter shift: ");       //asks for the number of positions to shift, stores as x
		Scanner pnumber = new Scanner (System.in);
		String x = pnumber.nextLine();


		System.out.println("Enter phrase: ");
		Scanner phrase = new Scanner (System.in);  //asks for the phrase (in capital english characters), stores as y
		String y = phrase.nextLine();

		int shift = Integer.parseInt(x);           //converts x to integer, shift is mod 26
		shift=shift%26;

		for ( int i=0;i<y.length();i++){
			char character = y.charAt(i);          //for each character of the string
			int ascii = (int) character;           //create the character's ascii number
			ascii = ascii + shift;                 //add the shift value
			if (ascii>90){                         //if the ascii number is after the ascii number for "Z"
				ascii=ascii-26;                    //we return to the beginning
			}
			if (ascii<65){                         //if the ascii number is before the ascii number for "A"
				ascii=ascii+26;                    //we return to the end
			}                                      //and finally we take the ascii value and convert it back into a character
			System.out.print(Character.toString ((char) ascii));
		}
	}
}