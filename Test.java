import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        
        //input
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input

        Map<String, List<String>> allowedCPUMap= new HashMap<>();
        allowedCPUMap.put("A", List.of("AMD","BDC","ADS"));
        allowedCPUMap.put("B", List.of("Kek","Bek","Cek"));

        String[] GPU = {"A","B","C"};

        for (String g : GPU) {

            for (String c : allowedCPUMap.get(g)) {
                
                System.out.println(g+" "+c);
            }
            
        }
        
    }
}
