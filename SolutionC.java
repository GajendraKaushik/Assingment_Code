public class SolutionC {
    public static boolean isPangram(String input) {
        for (char letter = 'a'; letter <= 'z'; letter++) {
            if (input.indexOf(letter) == -1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "Check if the input is pangram or not";

        boolean isPangram = isPangram(input.toLowerCase());

        if (isPangram) {
            System.out.println("is pangram");
        } else {
            System.out.println("is notpangram");
        }
    }
}
