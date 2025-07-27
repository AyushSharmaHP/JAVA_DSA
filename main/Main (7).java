import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.print("Enter the number of elements:");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the Elements: ");
		for(int i=0;i<arr.length;i++){
		    arr[i] = sc.nextInt();
		}
		System.out.print("Enter the element you want to find in array:");
		int x = sc.nextInt();
		
		for(int i=0;i<arr.length;i++){
		    if(arr[i]>x){
		        count++;
		    }
		}
		System.out.print("The number of Elements greater than " + x +"is " + count);
}
}