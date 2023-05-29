import java.util.*;

public class hey {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("The amount of money Rahul has before the currency exchange: ");
        int ia = input.nextInt();

        System.out.print("Enter the amount of money Rahul spent: ");
        int sp = input.nextInt();

        int ra = ia - sp;

        System.out.println("The remaining amount of money in Rahul's savings is: " + ra);
    }
}