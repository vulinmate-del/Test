public class Main {
    public static void main(String[] args) {
        String[] CPU = {"A","B"};
        String[] RAM = {"8GB","16GB"};

        for (String cpu : CPU) {
            for (String ram : RAM) {
                boolean isValid = !(cpu.equals("A") && ram.equals("16GB"));
                if (isValid) {
                System.out.println("CPU: " + cpu + ", RAM: " + ram);
                }
            }
        }
        
    }
}
