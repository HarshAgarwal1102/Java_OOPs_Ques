import java.util.Scanner;
public class ReverseNumber
{
	public static void main(String[] args) {
		System.out.println("Printing the reverse of a number");
		
		System.out.println();
		
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.print("Your reversed number is ");
		while(num!=0){
		    System.out.print(num%10);
		    num = num/10;
		}
	}
}
