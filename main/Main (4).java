import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements:");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the Elements: ");
		for(int i=0;i<arr.length;i++){
		    arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.print( arr[arr.length-1]);
	}
}
