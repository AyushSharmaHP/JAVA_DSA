import java.util.*;
public class Main
{
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter the number of elements: ");
			int n = sc.nextInt();
			
			int[] game = new int[n];

			System.out.println("Enter the Elements of the  array");
			for(int i=0; i<game.length; i++) {
				game[i] = sc.nextInt();
			}
				for(int i=0; i<game.length; i++) {
				System.out.print(game[i] + " ");
			}
			
		}
	}
