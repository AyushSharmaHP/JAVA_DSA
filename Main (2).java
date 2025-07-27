public class Main
{
	public static void main(String[] args) {
// 		int[] arr = {1,3,5,2,62,2};
		int[] arr = {1,2,3,4,3,3,5,5,6};
		int ans =1;
		for(int i =1; i<arr.length; i++) {
			if(arr[i]<arr[i-1]) ans =0;
		}
		if(ans==1){
		System.out.println("Array is sorted");}
		else{
		System.out.println("Array is not sorted");
	}
	}
}