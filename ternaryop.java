import java.util.Scanner;

public class ternaryop {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
//Ternary operator comditional ternary operator
        String ans =num %2 ==0 ? "even" : "odd";
        System.out.println(ans);
        }
}
