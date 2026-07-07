public class Main {
    public static void main(String[] args) {
        String[] CPU = {"A","B"};
        String[] RAM = {"8GB","16GB"};
        var rule= new Rules();
        for (String cpu : CPU) {
            for (String ram : RAM){
                if (rule.isValid(cpu,ram)) {
                System.out.println("CPU: " + cpu + ", RAM: " + ram);
                }
            }
        }
        
    }
}
