
public class Rules {

    public boolean isValid(String CPU, String RAM){
        boolean isValid = !(CPU.equals("A") && RAM.equals("16GB"));
        return isValid;
    }
}