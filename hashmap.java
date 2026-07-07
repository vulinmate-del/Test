import java.util.*;
public class hashmap {

    public static void main(String[] args) {

        Map<String, List<String>> allowedRAM = new HashMap<>();

        // Constraint table
        allowedRAM.put("A", List.of("8GB"));
        allowedRAM.put("B", List.of("8GB", "16GB"));

        String[] CPUs = {"A", "B"};

        ArrayList<String> lista = new ArrayList<String>();

        lista.add("1");
        lista.add("2");
        lista.add("8");
        lista.add("3");
        lista.add("5");
        lista.add("7");
        

        Collections.sort(lista);
        for(String a: lista){
            System.out.println(a);
        }
        for (String cpu : CPUs) {

            // Get only valid RAM options
            for (String ram : allowedRAM.get(cpu)) {
                System.out.println(
                "CPU:"+cpu +" - RAM: " + ram
                );
            }
        }
    }
}