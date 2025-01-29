public class UncommonBug {
    public static void main(String[] args) {
        int x = 5;
        try {
            x = Integer.parseInt("10a"); // This will throw a NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
        System.out.println(x); //x is still 5. This is the uncommon part!
    }
}