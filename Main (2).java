/******************************************************************************
 Print the sum of all elements in an array

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
        int arr[] ={1,2,300,4,5};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.print(sum);
	}
}
