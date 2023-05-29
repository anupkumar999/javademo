import java.util.Scanner;

public class evenorodd {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();

            if (x % 2 ==0){
                System.out.println("This is a even ");
            }

            else{
                System.out.println("This is Odd Number");
            }
        }
    }
}
