/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int x = 5;
	    boolean found = false;
	    System.out.print("Enter the number of elements: ");
	    int n= sc.nextInt();
	    int[] array = new int[n];
	    System.out.println("Enter the elements: ");
	    for(int i=0;i<array.length;i++){
	        array[i] = sc.nextInt();
	    }
	    
	    for(int i=0;i<array.length;i++){
	        if(array[i] == x){
	            System.out.print("Element Found at :" + i);
	            found = true;
	        }
	        }
	        if(!found){
	            System.out.print("Element not present");
	    }
	    sc.close();
		}
}
