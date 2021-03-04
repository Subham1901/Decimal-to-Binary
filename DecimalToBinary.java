@author Subham
import java.util.Scanner;
public class DecimalToBinary{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Decimal Value: ");
		int b=sc.nextInt();
		String d=Integer.toBinaryString(b);
		System.out.println("Binary is: "+d);
	}
}