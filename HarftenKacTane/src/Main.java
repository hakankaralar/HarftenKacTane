
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1 = input.nextLine();
        
        System.out.print("Enter a search character: ");
        String s2 = input.nextLine();
        char ch= s2.charAt(0);
        System.out.println("Searching character is "+ CountChars(s1, ch)+ " times ");
        
    }
    
    public static int CountChars(String str, char searchChar){
        
        int count = 0;
        for(int i = 0 ; i < str.length(); i++){
            if(searchChar == str.charAt(i)){
                count++;
            }
        }
        return count;
       
    }
}
