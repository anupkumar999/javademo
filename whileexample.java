//Count digits of a number using while loop

import java.util.Scanner;

class whileexample{
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
int num = sc.nextInt ();
int digits = 0;
while (num > 0) {
num /= 10 ;
digits++;
}
System.out.println(digits);
}
}