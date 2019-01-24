import java.util.Scanner;

public class GetPrime {
	public static boolean isNumPrime=true;
	public static int i=5;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int number = input.nextInt();
		
		boolean isItPrime=isPrime(number);
		
		if(isItPrime==true) {System.out.println("Is a prime number");}else {System.out.println("Is not a prime number");}

	}
	
	
	/*Below is the isPrime() function*/
	public static boolean isPrime(int num) {
		if(num<=3 && num>1) {isNumPrime=true;}
		  else if(num%2==0||num%3==0) {isNumPrime=false;}
	
		while((i*i)<=num) {
			if(num%i==0||(num%(i+2))==0){isNumPrime=false;}
			i=i+6;
		}
		
		return isNumPrime;
	}
	/*End of isPrime() function*/

}
