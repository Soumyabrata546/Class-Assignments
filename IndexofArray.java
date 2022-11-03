package HandsOn_Lab;

import java.util.Scanner;
//Write a Java program to find the index of an array element.
public class IndexofArray {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7};//array declaration
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the element you want to seach:");
	//TAking user input 
	int nio=sc.nextInt();
	for(int i=0;i<arr.length;i++)//printing the inderx of element
		if(nio==arr[i]) {
			System.out.println("Index of "+nio+"is "+i);
	break;}
}
}
