import java.util.Scanner;

public class caseone {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            char ch = sc.next().charAt(0);

            switch (ch){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                System.out.println("This is Vowel"); 
                break;
                default:
                System.out.println("This is a consonent");
            }
        }
        }
    }
 
