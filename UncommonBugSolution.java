public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 5;
        try {
            x = Integer.parseInt("10a"); 
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
            // Handle the exception by providing a default or alternative value for x
            x = 0; // or some other suitable default value
        }
        System.out.println(x); // x will now be 0
    }
}