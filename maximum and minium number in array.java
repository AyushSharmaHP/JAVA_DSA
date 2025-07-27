public class Main
{
	public static void main(String[] args) {
	    int[] arr = {1, 6, 5, 3, 5};
	    int max=arr[0];
	    int min=arr[0];
	    for(int i=0;i<arr.length;i++){
        max = Math.max(max,arr[i]);
        min = Math.min(min,arr[i]);
	}
	System.out.println(max);
	System.out.println(min);
}
}
