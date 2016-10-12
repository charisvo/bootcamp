public class Dice{
	public static void main(String args[]){
		Dice.roll();
	}
	public static void roll(){
			int i=1 , x , y;
			do{
				x=(int)(Math.random() * 6 + 1);
				y=(int)(Math.random() * 6 + 1);
				i++;
			}while(! (x==1 && y==1));
			System.out.println(i);
	}
}