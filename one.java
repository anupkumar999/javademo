import java.util.Scanner;
public class one {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
            int p = sc.nextInt();
            int t = sc.nextInt();
            int r = sc.nextInt();
            float si =(p * t * r ) / 100;
            System.out.println(" Simple Interest : "+si);
    }
}