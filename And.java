
public class And {
    public static void main(String[] args) {
        int age = 15;
        String citizenship = "Indian";
        if (age >= 18 && citizenship == "Indian") {
            System.out.println("Person may vote");
        } else {
            System.out.println("Person cannot vote");
        }
    }
}