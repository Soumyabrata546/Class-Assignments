package HandsOn_Lab;

public class SecSmallest {
public static void main(String[] args) {
	//Write a Java program to find the 
	//second smallest element in an array.
	int arr[]= {4,9,2,3,6};//array declaration
	int l,tmp=0;
	for(int i=0;i<arr.length-1;i++){//for loop
		//performing bubble sort 
		for(int j=i+1;j<arr.length-1;j++)
		if(arr[j]<arr[i]) {
			tmp=arr[j];
		arr[j]=arr[i];
			arr[i]=tmp;	
		}
	}
	System.out.println("The 2nd smallest no is ");//printing the inderx of element
		System.out.println(arr[1]);
	
}
}
