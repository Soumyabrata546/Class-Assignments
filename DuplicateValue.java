package PallabiMaam;
/*Write a Java program to find the duplicate values 
      of an array of integer values.
      */
public class DuplicateValue {
	public static void main(String[] args) {
	int []arr= {2,3,4,7,5,4,3,5};
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++)
			if(arr[i]==arr[j]) {
				System.out.println("Duplicate value ="+arr[i]);
				break;
			}
	}
	}
}
