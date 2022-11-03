package HandsOn_Lab;
//Write a Java program to copy an array by iterating the array.
public class CopyArray {
public static void main(String[] args) {
	int []arr= {1,2,3,4,5,6};//Source array
	int []arr2=new int[(arr.length)+2];//destination array
	System.arraycopy(arr, 0, arr2, 0, 6);//copying arr to arr2
	for(int i=0;i<arr.length;i++)//printing the dest array
	System.out.println(arr2[i]);
}
}
