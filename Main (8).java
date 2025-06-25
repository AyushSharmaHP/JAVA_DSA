/* swap an array without using another array*/

public class Main
{
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
        }
    }
	public static void main(String[] args) {
	    int[] arr = {12,14,15,35,13,51,13,151,12,124};
	    print(arr);
	    swap(arr);
	    print(arr);
	}
}
