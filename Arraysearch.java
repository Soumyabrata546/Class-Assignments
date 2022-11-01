package PallabiMaam;
/*
 Write a Java program to test if an array contains 
      a specific value.
*/
import java.util.Scanner;

public class Arraysearch {
public static void main(String[] args) {
	int []arr= {2,3,4,7,5};
	System.out.println("Enter a no=");
	Scanner sc=new Scanner(System.in);
	int no=sc.nextInt();
	boolean f=false;
	for(int i:arr) {
		if(no==i) {
			f=true;
			System.out.println("This array Contains the no");
		break;
		}
		
	}if(f==false)
		System.out.println("Dont contain the no you entered");
		
}
}
