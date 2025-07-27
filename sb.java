
import java.util.*;

public class sb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();                    // Take string input
        StringBuilder sb = new StringBuilder(input);     // Create StringBuilder from input

        System.out.println("You entered: " + sb);        // Print the StringBuilder content
        sc.close();

        for(int i=0; i<sb.length();i++){
            boolean flag = true;
            char ch  = sb.charAt(i);
            int ascii = (int)ch;
            if(ascii>=97) flag =false;
            if(flag== true){                                //Capital
                 ascii += 32;
                char dh = (char)ascii;    
                 sb.setCharAt(i, dh);
            }else{
                ascii -= 32;
                char dh = (char)ascii;    
                sb.setCharAt(i, dh);   
            }
        }
        System.out.println(sb);
    }
}
