// public class logic {
//     public static void main(String args[]){
//         String weather ="sunny";

//         if(weather =="rainy"){
//             System.out.println("Take a Umbrella");
//         }
//         else if(weather !="rainy"){
//             System.out.println("wear the sunglasss");

//         }
//         else {
//             System.out.println("check the weather forcast");
//         }


//     }
// }
 public class logic {
public static void main(String arge[]){
    String weather ="rainy";

    switch(weather){
        case "rainy":
        System.out.println("Take an umbrella");
        break;
        case "sunny":
        System.out.println("Weare a sun glass");
        break;
        default:
        System.out.println("check the weather forcast");
    }
}

 }